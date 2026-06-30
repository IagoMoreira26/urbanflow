package com.iagomoreira.urbanflow.service.request;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Service
public class RequestService {

	private final RequestCommandService requestCommandService;
	private final RequestQueryService requestQueryService;
	private final RequestWorkflowService requestWorkflowService;
	private final RequestStatisticsService requestStatisticsService;

	public RequestService(RequestCommandService requestCommandService, RequestQueryService requestQueryService,
			RequestWorkflowService requestWorkflowService, RequestStatisticsService requestStatisticsService) {
		super();
		this.requestCommandService = requestCommandService;
		this.requestQueryService = requestQueryService;
		this.requestWorkflowService = requestWorkflowService;
		this.requestStatisticsService = requestStatisticsService;
	}

	public RequestResponseDTO create(CreateRequestDTO dto) {
		return requestCommandService.create(dto);
	}

	public RequestResponseDTO update(String id, UpdateRequestDTO dto) {
		return requestCommandService.update(id, dto);
	}

	public void delete(String id) {
		requestCommandService.delete(id);
	}

	public RequestResponseDTO updateStatus(String id, UpdateRequestStatusDTO dto) {
		return requestWorkflowService.updateStatus(id, dto);
	}

	public List<RequestResponseDTO> findAll() {
		return requestQueryService.findAll();
	}

	public RequestResponseDTO findById(String id) {
		return requestQueryService.findById(id);
	}

	public List<RequestResponseDTO> findByStatus(RequestStatus status) {
		return requestQueryService.findByStatus(status);
	}

	public List<RequestResponseDTO> findByCategory(String categoryId) {
		return requestQueryService.findByCategory(categoryId);
	}

	public List<RequestResponseDTO> findBySubCategory(String subCategoryId) {
		return requestQueryService.findBySubCategory(subCategoryId);
	}

	public List<RequestResponseDTO> findByUser(String userId) {
		return requestQueryService.findByUser(userId);
	}

	public List<RequestResponseDTO> findByDepartment(String departmentId) {
		return requestQueryService.findByDepartment(departmentId);
	}

	public Page<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId, int page, int size, String sortBy, String direction) {
		return requestQueryService.search(status, categoryId, subCategoryId, departmentId, userId, page, size, sortBy,
				direction);
	}

	public List<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId) {
		return requestQueryService.search(status, categoryId, subCategoryId, departmentId, userId);
	}

	public RequestStatisticsDTO getStatistics() {
		return requestStatisticsService.getStatistics();
	}

	public CategoryStatisticsDTO getCategoryStatistics(String categoryId) {
		return requestStatisticsService.getCategoryStatistics(categoryId);
	}

	public SubCategoryStatisticsDTO getSubCategoryStatistics(String subCategoryId) {
		return requestStatisticsService.getSubCategoryStatistics(subCategoryId);
	}
}
