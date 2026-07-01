package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.request.RequestService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/requests")
@Tag(name = "Requests", description = "Endpoints for managing service requests")
public class RequestController {

	private final RequestService requestService;

	public RequestController(RequestService requestService) {
		this.requestService = requestService;
	}

	@PostMapping
	@PreAuthorize("hasRole('CITIZEN')")
	@Operation(summary = "Create a new request", description = "Creates a service request (citizen only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Request created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<RequestResponseDTO> create(@Valid @RequestBody CreateRequestDTO dto) {
		RequestResponseDTO response = requestService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all requests", description = "Returns a list of all requests")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))) })
	public ResponseEntity<List<RequestResponseDTO>> findAll() {
		return ResponseEntity.ok(requestService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get request by ID", description = "Returns a single request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Request found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<RequestResponseDTO> findById(
			@Parameter(description = "ID of the request") @PathVariable String id) {
		return ResponseEntity.ok(requestService.findById(id));
	}

	@GetMapping("/status/{status}")
	@Operation(summary = "Get requests by status", description = "Returns all requests with a given status")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))) })
	public ResponseEntity<List<RequestResponseDTO>> findByStatus(
			@Parameter(description = "Status filter") @PathVariable RequestStatus status) {
		return ResponseEntity.ok(requestService.findByStatus(status));
	}

	@GetMapping("/category/{categoryId}")
	@Operation(summary = "Get requests by category", description = "Returns all requests belonging to a category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findByCategory(
			@Parameter(description = "Category ID") @PathVariable String categoryId) {
		return ResponseEntity.ok(requestService.findByCategory(categoryId));
	}

	@GetMapping("/subcategory/{subCategoryId}")
	@Operation(summary = "Get requests by subcategory", description = "Returns all requests belonging to a subcategory")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findBySubCategory(
			@Parameter(description = "Subcategory ID") @PathVariable String subCategoryId) {
		return ResponseEntity.ok(requestService.findBySubCategory(subCategoryId));
	}

	@GetMapping("/user/{userId}")
	@Operation(summary = "Get requests by user", description = "Returns all requests created by a specific user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findByUser(
			@Parameter(description = "User ID") @PathVariable String userId) {
		return ResponseEntity.ok(requestService.findByUser(userId));
	}

	@GetMapping("/department/{departmentId}")
	@PreAuthorize("hasRole('ADMIN') or hasRole('OPERATOR')")
	@Operation(summary = "Get requests by department", description = "Returns all requests assigned to a department (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findByDepartment(
			@Parameter(description = "Department ID") @PathVariable String departmentId) {
		return ResponseEntity.ok(requestService.findByDepartment(departmentId));
	}

	@GetMapping("/statistics")
	@Operation(summary = "Get global request statistics", description = "Returns overall statistics")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestStatisticsDTO.class))) })
	public ResponseEntity<RequestStatisticsDTO> getStatistics() {
		return ResponseEntity.ok(requestService.getStatistics());
	}

	@GetMapping("/statistics/category/{categoryId}")
	@Operation(summary = "Get statistics for a category", description = "Returns statistics for requests in a category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryStatisticsDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content) })
	public ResponseEntity<CategoryStatisticsDTO> getCategoryStatistics(
			@Parameter(description = "Category ID") @PathVariable String categoryId) {
		return ResponseEntity.ok(requestService.getCategoryStatistics(categoryId));
	}

	@GetMapping("/statistics/subcategory/{subCategoryId}")
	@Operation(summary = "Get statistics for a subcategory", description = "Returns statistics for requests in a subcategory")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryStatisticsDTO.class))),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content) })
	public ResponseEntity<SubCategoryStatisticsDTO> getSubCategoryStatistics(
			@Parameter(description = "Subcategory ID") @PathVariable String subCategoryId) {
		return ResponseEntity.ok(requestService.getSubCategoryStatistics(subCategoryId));
	}

	@GetMapping("/search")
	@Operation(summary = "Search requests with filters and pagination", description = "Returns a paginated list of requests matching filters")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Search results", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))) })
	public ResponseEntity<Page<RequestResponseDTO>> search(
			@Parameter(description = "Filter by status") @RequestParam(required = false) RequestStatus status,
			@Parameter(description = "Filter by category ID") @RequestParam(required = false) String categoryId,
			@Parameter(description = "Filter by subcategory ID") @RequestParam(required = false) String subCategoryId,
			@Parameter(description = "Filter by department ID") @RequestParam(required = false) String departmentId,
			@Parameter(description = "Filter by user ID") @RequestParam(required = false) String userId,
			@Parameter(description = "Page number") @RequestParam(defaultValue = "0") int page,
			@Parameter(description = "Page size") @RequestParam(defaultValue = "10") int size,
			@Parameter(description = "Sort field") @RequestParam(defaultValue = "createdAt") String sortBy,
			@Parameter(description = "Sort direction") @RequestParam(defaultValue = "desc") String direction) {
		Page<RequestResponseDTO> pageResult = requestService.search(status, categoryId, subCategoryId, departmentId,
				userId, page, size, sortBy, direction);
		return ResponseEntity.ok(pageResult);
	}

	@PutMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "Update a request", description = "Updates an existing request (authenticated user)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Request updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<RequestResponseDTO> update(
			@Parameter(description = "ID of the request to update") @PathVariable String id,
			@Valid @RequestBody UpdateRequestDTO dto) {
		return ResponseEntity.ok(requestService.update(id, dto));
	}

	@PatchMapping("/{id}/status")
	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@Operation(summary = "Update request status", description = "Updates the status of a request (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Status updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid status", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<RequestResponseDTO> updateStatus(
			@Parameter(description = "ID of the request") @PathVariable String id,
			@Valid @RequestBody UpdateRequestStatusDTO dto) {
		return ResponseEntity.ok(requestService.updateStatus(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "Delete a request", description = "Deletes a request by ID (authenticated user)")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Request deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the request to delete") @PathVariable String id) {
		requestService.delete(id);
		return ResponseEntity.noContent().build();
	}
}