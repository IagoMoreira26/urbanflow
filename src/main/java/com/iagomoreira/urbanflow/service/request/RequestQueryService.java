package com.iagomoreira.urbanflow.service.request;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class RequestQueryService {

	private final MongoTemplate mongoTemplate;
	private final RequestRepository requestRepository;
	private final UserRepository userRepository;
	private final CategoryRepository categoryRepository;
	private final DepartmentRepository departmentRepository;
	private final SubCategoryRepository subCategoryRepository;
	private final SecurityService securityService;
	private final RequestValidationService requestValidationService;
	private final RequestMapper requestMapper;

	public RequestQueryService(MongoTemplate mongoTemplate, RequestRepository requestRepository,
			UserRepository userRepository, CategoryRepository categoryRepository,
			DepartmentRepository departmentRepository, SubCategoryRepository subCategoryRepository,
			SecurityService securityService, RequestValidationService requestValidationService,
			RequestMapper requestMapper) {
		this.mongoTemplate = mongoTemplate;
		this.requestRepository = requestRepository;
		this.userRepository = userRepository;
		this.categoryRepository = categoryRepository;
		this.departmentRepository = departmentRepository;
		this.subCategoryRepository = subCategoryRepository;
		this.securityService = securityService;
		this.requestValidationService = requestValidationService;
		this.requestMapper = requestMapper;
	}

	public List<RequestResponseDTO> findAll() {
		List<Request> requests;

		if (securityService.isAdmin()) {
			requests = requestRepository.findAll();
		} else if (securityService.isOperator()) {
			requests = requestRepository.findByDepartmentId(securityService.getAuthenticatedDepartmentId());
		} else {
			requests = requestRepository.findByUserId(securityService.getAuthenticatedUserId());
		}

		return requests.stream().map(requestMapper::toResponse).toList();
	}

	public RequestResponseDTO findById(String id) {
		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		return requestMapper.toResponse(request);
	}

	public List<RequestResponseDTO> findByStatus(RequestStatus status) {
		return requestRepository.findByStatus(status).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findByCategory(String categoryId) {
		if (!categoryRepository.existsById(categoryId)) {
			throw new ResourceNotFoundException("Category not found");
		}

		return requestRepository.findByCategoryId(categoryId).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findBySubCategory(String subCategoryId) {
		if (!subCategoryRepository.existsById(subCategoryId)) {
			throw new ResourceNotFoundException("SubCategory not found");
		}

		return requestRepository.findBySubCategoryId(subCategoryId).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findByUser(String userId) {
		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}
		if (securityService.isCitizen() && !securityService.getAuthenticatedUserId().equals(userId)) {
			throw new BusinessException("Access denied");
		}

		return requestRepository.findByUserId(userId).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findByDepartment(String departmentId) {
		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
		if (securityService.isCitizen()) {
			throw new BusinessException("Access denied");
		}
		if (securityService.isOperator() && !securityService.getAuthenticatedDepartmentId().equals(departmentId)) {
			throw new BusinessException("Access denied");
		}

		return requestRepository.findByDepartmentId(departmentId).stream().map(requestMapper::toResponse).toList();
	}

	public Page<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId, int page, int size, String sortBy, String direction) {

		String validatedSortField = validateSortField(sortBy);

		if (securityService.isOperator()) {
			departmentId = securityService.getAuthenticatedDepartmentId();
			userId = null;
		}
		if (securityService.isCitizen()) {
			userId = securityService.getAuthenticatedUserId();
			departmentId = null;
		}

		Criteria criteria = buildCriteria(status, categoryId, subCategoryId, departmentId, userId);
		Query query = new Query(criteria);

		Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(validatedSortField).descending()
				: Sort.by(validatedSortField).ascending();
		query.with(sort);

		long total = mongoTemplate.count(query, Request.class);

		Pageable pageable = PageRequest.of(page, size, sort);
		query.with(pageable);

		List<Request> requests = mongoTemplate.find(query, Request.class);
		List<RequestResponseDTO> content = requests.stream().map(requestMapper::toResponse).toList();

		return new PageImpl<>(content, pageable, total);
	}

	public List<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId) {

		if (securityService.isOperator()) {
			departmentId = securityService.getAuthenticatedDepartmentId();
			userId = null;
		}
		if (securityService.isCitizen()) {
			userId = securityService.getAuthenticatedUserId();
			departmentId = null;
		}

		Criteria criteria = buildCriteria(status, categoryId, subCategoryId, departmentId, userId);
		Query query = new Query(criteria);
		List<Request> requests = mongoTemplate.find(query, Request.class);
		return requests.stream().map(requestMapper::toResponse).toList();
	}

	private Criteria buildCriteria(RequestStatus status, String categoryId, String subCategoryId, String departmentId,
			String userId) {
		Criteria criteria = new Criteria();
		if (status != null) {
			criteria = criteria.and("status").is(status);
		}
		if (categoryId != null && !categoryId.isBlank()) {
			criteria = criteria.and("categoryId").is(categoryId);
		}
		if (subCategoryId != null && !subCategoryId.isBlank()) {
			criteria = criteria.and("subCategoryId").is(subCategoryId);
		}
		if (userId != null && !userId.isBlank()) {
			criteria = criteria.and("userId").is(userId);
		}
		if (departmentId != null && !departmentId.isBlank()) {
			criteria = criteria.and("departmentId").is(departmentId);
		}
		return criteria;
	}

	private String validateSortField(String sortBy) {
		Set<String> allowedFields = Set.of("createdAt", "updatedAt", "title", "status", "citizenPriority",
				"departmentId");
		return allowedFields.contains(sortBy) ? sortBy : "createdAt";
	}
}