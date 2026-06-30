package com.iagomoreira.urbanflow.service.request;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class RequestStatisticsService {

	private final RequestRepository requestRepository;
	private final CategoryRepository categoryRepository;
	private final SubCategoryRepository subCategoryRepository;

	public RequestStatisticsService(RequestRepository requestRepository, CategoryRepository categoryRepository,
			SubCategoryRepository subCategoryRepository) {
		super();
		this.requestRepository = requestRepository;
		this.categoryRepository = categoryRepository;
		this.subCategoryRepository = subCategoryRepository;
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
}
