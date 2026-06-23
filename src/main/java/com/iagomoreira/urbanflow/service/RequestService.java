package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.security.SecurityUtils;

@Service
public class RequestService {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Autowired
	private RequestHistoryRepository requestHistoryRepository;

	private Request fromDTO(CreateRequestDTO dto) {

		Request request = new Request();

		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());

		request.setUserId(dto.getUserId());

		request.setCategoryId(dto.getCategoryId());
		request.setSubCategoryId(dto.getSubCategoryId());

		request.setCitizenPriority(dto.getCitizenPriority());

		request.setLatitude(dto.getLatitude());
		request.setLongitude(dto.getLongitude());

		if (dto.getAddress() != null) {

			Address address = new Address();

			address.setCep(dto.getAddress().getCep());
			address.setStreet(dto.getAddress().getStreet());
			address.setNumber(dto.getAddress().getNumber());
			address.setNeighborhood(dto.getAddress().getNeighborhood());
			address.setCity(dto.getAddress().getCity());
			address.setState(dto.getAddress().getState());
			address.setComplement(dto.getAddress().getComplement());

			request.setAddress(address);
		}

		return request;
	}

	public Page<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId, String userId,
			int page, int size, String sortBy, String direction) {

		String validatedSortField = validateSortField(sortBy);

		Criteria criteria = buildCriteria(status, categoryId, subCategoryId, userId);
		Query query = new Query(criteria);

		Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(validatedSortField).descending()
				: Sort.by(validatedSortField).ascending();
		query.with(sort);

		long total = mongoTemplate.count(query, Request.class);

		Pageable pageable = PageRequest.of(page, size, sort);
		query.with(pageable);

		List<Request> requests = mongoTemplate.find(query, Request.class);
		List<RequestResponseDTO> content = requests.stream().map(RequestResponseDTO::new).toList();

		return new PageImpl<>(content, pageable, total);
	}

	public RequestResponseDTO create(CreateRequestDTO dto) {

		if (!userRepository.existsById(dto.getUserId())) {
			throw new ResourceNotFoundException("User not found");
		}

		if (!categoryRepository.existsById(dto.getCategoryId())) {
			throw new ResourceNotFoundException("Category not found");
		}

		SubCategory subCategory = subCategoryRepository.findById(dto.getSubCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));

		if (!subCategory.getCategoryId().equals(dto.getCategoryId())) {

			throw new BusinessException("SubCategory does not belong to the selected category");
		}

		Request request = fromDTO(dto);

		request.setCreatedAt(LocalDateTime.now());

		request.setStatus(RequestStatus.RECEIVED);

		Request savedRequest = requestRepository.save(request);

		return new RequestResponseDTO(savedRequest);
	}

	public List<RequestResponseDTO> findAll() {

		List<Request> requests = requestRepository.findAll();

		return requests.stream().map(RequestResponseDTO::new).toList();
	}

	public RequestResponseDTO findById(String id) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		return new RequestResponseDTO(request);
	}

	public List<RequestResponseDTO> findByStatus(RequestStatus status) {

		return requestRepository.findByStatus(status).stream().map(RequestResponseDTO::new).toList();
	}

	public List<RequestResponseDTO> findByCategory(String categoryId) {

		if (!categoryRepository.existsById(categoryId)) {
			throw new ResourceNotFoundException("Category not found");
		}

		return requestRepository.findByCategoryId(categoryId).stream().map(RequestResponseDTO::new).toList();
	}

	public List<RequestResponseDTO> findBySubCategory(String subCategoryId) {

		if (!subCategoryRepository.existsById(subCategoryId)) {
			throw new ResourceNotFoundException("SubCategory not found");
		}

		return requestRepository.findBySubCategoryId(subCategoryId).stream().map(RequestResponseDTO::new).toList();
	}

	public List<RequestResponseDTO> findByUser(String userId) {

		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}

		return requestRepository.findByUserId(userId).stream().map(RequestResponseDTO::new).toList();
	}

	public RequestStatisticsDTO getStatistics() {

		List<Request> requests = requestRepository.findAll();

		int totalRequests = requests.size();

		if (totalRequests == 0) {

			return new RequestStatisticsDTO(0, 0, 0, 0, 0, 0.0);
		}

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();

		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();

		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();

		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();

		double resolutionRate = (resolvedRequests * 100.0) / totalRequests;

		return new RequestStatisticsDTO(totalRequests, receivedRequests, inProgressRequests, resolvedRequests,
				cancelledRequests, resolutionRate);
	}

	public CategoryStatisticsDTO getCategoryStatistics(String categoryId) {

		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category not found"));

		List<Request> requests = requestRepository.findByCategoryId(categoryId);

		int totalRequests = requests.size();

		if (totalRequests == 0) {

			return new CategoryStatisticsDTO(category.getId(), category.getName(), 0, 0, 0, 0, 0, 0.0);
		}

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();

		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();

		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();

		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();

		double resolutionRate = (resolvedRequests * 100.0) / totalRequests;

		return new CategoryStatisticsDTO(category.getId(), category.getName(), totalRequests, receivedRequests,
				inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate);
	}

	public SubCategoryStatisticsDTO getSubCategoryStatistics(String subCategoryId) {

		SubCategory subCategory = subCategoryRepository.findById(subCategoryId)
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));

		List<Request> requests = requestRepository.findBySubCategoryId(subCategoryId);

		int totalRequests = requests.size();

		if (totalRequests == 0) {

			return new SubCategoryStatisticsDTO(subCategory.getId(), subCategory.getName(), 0, 0, 0, 0, 0, 0.0);
		}

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();

		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();

		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();

		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();

		double resolutionRate = (resolvedRequests * 100.0) / totalRequests;

		return new SubCategoryStatisticsDTO(subCategory.getId(), subCategory.getName(), totalRequests, receivedRequests,
				inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate);
	}

	public List<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String userId) {
		Criteria criteria = buildCriteria(status, categoryId, subCategoryId, userId);
		Query query = new Query(criteria);
		List<Request> requests = mongoTemplate.find(query, Request.class);
		return requests.stream().map(RequestResponseDTO::new).toList();
	}

	public RequestResponseDTO update(String id, UpdateRequestDTO dto) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		if (request.getStatus() == RequestStatus.RESOLVED || request.getStatus() == RequestStatus.CANCELLED) {

			throw new BusinessException("Resolved or cancelled requests cannot be modified");
		}

		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());

		request = requestRepository.save(request);

		return new RequestResponseDTO(request);
	}

	public RequestResponseDTO updateStatus(String id, UpdateRequestStatusDTO dto) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		validateStatusTransition(request.getStatus(), dto.getStatus());

		RequestStatus oldStatus = request.getStatus();

		request.setStatus(dto.getStatus());

		request.setCreatedAt(LocalDateTime.now());

		RequestHistory history = new RequestHistory();

		history.setRequestId(request.getId());

		history.setOldStatus(oldStatus);

		history.setNewStatus(dto.getStatus());

		history.setChangedBy(SecurityUtils.getCurrentUserEmail());

		history.setNote(dto.getNote());

		history.setChangedAt(LocalDateTime.now());

		requestHistoryRepository.save(history);

		request = requestRepository.save(request);

		return new RequestResponseDTO(request);
	}

	public void delete(String id) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		if (request.getStatus() == RequestStatus.RESOLVED) {

			throw new BusinessException("Resolved requests cannot be deleted");
		}

		requestRepository.deleteById(id);
	}

	private Criteria buildCriteria(RequestStatus status, String categoryId, String subCategoryId, String userId) {
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
		return criteria;
	}

	private String validateSortField(String sortBy) {
		Set<String> allowedFields = Set.of("createdAt", "title", "status", "citizenPriority", "updatedAt");
		return allowedFields.contains(sortBy) ? sortBy : "createdAt";
	}

	private void validateStatusTransition(RequestStatus current, RequestStatus next) {

		switch (current) {

		case RECEIVED:

			if (next != RequestStatus.UNDER_REVIEW && next != RequestStatus.CANCELLED) {

				throw new BusinessException("Invalid status transition");
			}

			break;

		case UNDER_REVIEW:

			if (next != RequestStatus.APPROVED && next != RequestStatus.REJECTED) {

				throw new BusinessException("Invalid status transition");
			}

			break;

		case APPROVED:

			if (next != RequestStatus.IN_PROGRESS) {

				throw new BusinessException("Invalid status transition");
			}

			break;

		case IN_PROGRESS:

			if (next != RequestStatus.RESOLVED) {

				throw new BusinessException("Invalid status transition");
			}

			break;

		case RESOLVED:
		case REJECTED:
		case CANCELLED:

			throw new BusinessException("Request is already finalized");
		}
	}
}
