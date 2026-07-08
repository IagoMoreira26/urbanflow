package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.request.RequestService;

@WebMvcTest(RequestController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class RequestControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private RequestService requestService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateRequestDTO createDTO;
	private UpdateRequestDTO updateDTO;
	private UpdateRequestStatusDTO updateStatusDTO;
	private RequestResponseDTO responseDTO;
	private RequestStatisticsDTO statisticsDTO;
	private CategoryStatisticsDTO categoryStatisticsDTO;
	private SubCategoryStatisticsDTO subCategoryStatisticsDTO;
	private final String requestId = "req-123";
	private final String userId = "user-456";
	private final String categoryId = "cat-789";
	private final String subCategoryId = "sub-101";
	private final String departmentId = "dep-112";

	@BeforeEach
	void setUp() {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCep("58700-000");
		addressDTO.setStreet("Rua da Liberdade");
		addressDTO.setNumber("42");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("Patos");
		addressDTO.setState("PB");
		addressDTO.setComplement("Sobrado");

		AddressResponseDTO addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("58700-000");
		addressResponseDTO.setStreet("Rua da Liberdade");
		addressResponseDTO.setNumber("42");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("Patos");
		addressResponseDTO.setState("PB");
		addressResponseDTO.setComplement("Sobrado");

		createDTO = new CreateRequestDTO();
		createDTO.setTitle("Buraco na rua");
		createDTO.setDescription("Buraco grande na Rua da Liberdade, próximo ao número 42");
		createDTO.setCategoryId(categoryId);
		createDTO.setSubCategoryId(subCategoryId);
		createDTO.setCitizenPriority(PriorityLevel.HIGH);
		createDTO.setLatitude(-7.0244);
		createDTO.setLongitude(-37.2806);
		createDTO.setAddress(addressDTO);

		updateDTO = new UpdateRequestDTO();
		updateDTO.setTitle("Buraco na rua (atualizado)");
		updateDTO.setDescription("Buraco ainda maior, precisa de reparo urgente");

		updateStatusDTO = new UpdateRequestStatusDTO();
		updateStatusDTO.setStatus(RequestStatus.IN_PROGRESS);
		updateStatusDTO.setNote("Em andamento pela equipe de obras");

		responseDTO = new RequestResponseDTO();
		responseDTO.setId(requestId);
		responseDTO.setTitle("Buraco na rua");
		responseDTO.setDescription("Buraco grande na Rua da Liberdade, próximo ao número 42");
		responseDTO.setUserId(userId);
		responseDTO.setCategoryId(categoryId);
		responseDTO.setSubCategoryId(subCategoryId);
		responseDTO.setCitizenPriority(PriorityLevel.HIGH);
		responseDTO.setStatus(RequestStatus.RECEIVED);
		responseDTO.setLatitude(-7.0244);
		responseDTO.setLongitude(-37.2806);
		responseDTO.setAddress(addressResponseDTO);
		responseDTO.setDepartmentId(departmentId);
		responseDTO.setCreatedAt(LocalDateTime.now());

		statisticsDTO = new RequestStatisticsDTO();
		statisticsDTO.setTotalRequests(10);
		statisticsDTO.setReceivedRequests(3);
		statisticsDTO.setInProgressRequests(4);
		statisticsDTO.setResolvedRequests(2);
		statisticsDTO.setCancelledRequests(1);
		statisticsDTO.setResolutionRate(20.0);

		categoryStatisticsDTO = new CategoryStatisticsDTO();
		categoryStatisticsDTO.setCategoryId(categoryId);
		categoryStatisticsDTO.setTotalRequests(5);
		categoryStatisticsDTO.setResolvedRequests(1);
		categoryStatisticsDTO.setResolutionRate(20.0);

		subCategoryStatisticsDTO = new SubCategoryStatisticsDTO();
		subCategoryStatisticsDTO.setSubCategoryId(subCategoryId);
		subCategoryStatisticsDTO.setTotalRequests(3);
		subCategoryStatisticsDTO.setResolvedRequests(0);
		subCategoryStatisticsDTO.setResolutionRate(0.0);
	}

	@Test
	void shouldCreateRequest() throws Exception {
		when(requestService.create(any(CreateRequestDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/requests").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(requestId))
				.andExpect(jsonPath("$.title").value("Buraco na rua"))
				.andExpect(jsonPath("$.description").value("Buraco grande na Rua da Liberdade, próximo ao número 42"))
				.andExpect(jsonPath("$.userId").value(userId)).andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.subCategoryId").value(subCategoryId))
				.andExpect(jsonPath("$.citizenPriority").value("HIGH"))
				.andExpect(jsonPath("$.status").value("RECEIVED")).andExpect(jsonPath("$.latitude").value(-7.0244))
				.andExpect(jsonPath("$.longitude").value(-37.2806))
				.andExpect(jsonPath("$.departmentId").value(departmentId))
				.andExpect(jsonPath("$.address.cep").value("58700-000"))
				.andExpect(jsonPath("$.address.city").value("Patos"));

		verify(requestService).create(any(CreateRequestDTO.class));
	}

	@Test
	void shouldFindAllRequests() throws Exception {
		when(requestService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(requestId))
				.andExpect(jsonPath("$[0].title").value("Buraco na rua"));

		verify(requestService).findAll();
	}

	@Test
	void shouldFindRequestById() throws Exception {
		when(requestService.findById(requestId)).thenReturn(responseDTO);

		mockMvc.perform(get("/requests/{id}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(requestId)).andExpect(jsonPath("$.title").value("Buraco na rua"));

		verify(requestService).findById(requestId);
	}

	@Test
	void shouldFindRequestsByStatus() throws Exception {
		when(requestService.findByStatus(RequestStatus.RECEIVED)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/status/{status}", RequestStatus.RECEIVED)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].status").value("RECEIVED"));

		verify(requestService).findByStatus(RequestStatus.RECEIVED);
	}

	@Test
	void shouldFindRequestsByCategory() throws Exception {
		when(requestService.findByCategory(categoryId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/category/{categoryId}", categoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].categoryId").value(categoryId));

		verify(requestService).findByCategory(categoryId);
	}

	@Test
	void shouldFindRequestsBySubCategory() throws Exception {
		when(requestService.findBySubCategory(subCategoryId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/subcategory/{subCategoryId}", subCategoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].subCategoryId").value(subCategoryId));

		verify(requestService).findBySubCategory(subCategoryId);
	}

	@Test
	void shouldFindRequestsByUser() throws Exception {
		when(requestService.findByUser(userId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/user/{userId}", userId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].userId").value(userId));

		verify(requestService).findByUser(userId);
	}

	@Test
	void shouldFindRequestsByDepartment() throws Exception {
		when(requestService.findByDepartment(departmentId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/department/{departmentId}", departmentId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(requestService).findByDepartment(departmentId);
	}

	@Test
	void shouldGetStatistics() throws Exception {
		when(requestService.getStatistics()).thenReturn(statisticsDTO);

		mockMvc.perform(get("/requests/statistics")).andExpect(status().isOk())
				.andExpect(jsonPath("$.totalRequests").value(10)).andExpect(jsonPath("$.receivedRequests").value(3))
				.andExpect(jsonPath("$.inProgressRequests").value(4)).andExpect(jsonPath("$.resolvedRequests").value(2))
				.andExpect(jsonPath("$.cancelledRequests").value(1))
				.andExpect(jsonPath("$.resolutionRate").value(20.0));

		verify(requestService).getStatistics();
	}

	@Test
	void shouldGetCategoryStatistics() throws Exception {
		when(requestService.getCategoryStatistics(categoryId)).thenReturn(categoryStatisticsDTO);

		mockMvc.perform(get("/requests/statistics/category/{categoryId}", categoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.categoryId").value(categoryId)).andExpect(jsonPath("$.totalRequests").value(5))
				.andExpect(jsonPath("$.resolvedRequests").value(1)).andExpect(jsonPath("$.resolutionRate").value(20.0));

		verify(requestService).getCategoryStatistics(categoryId);
	}

	@Test
	void shouldGetSubCategoryStatistics() throws Exception {
		when(requestService.getSubCategoryStatistics(subCategoryId)).thenReturn(subCategoryStatisticsDTO);

		mockMvc.perform(get("/requests/statistics/subcategory/{subCategoryId}", subCategoryId))
				.andExpect(status().isOk()).andExpect(jsonPath("$.subCategoryId").value(subCategoryId))
				.andExpect(jsonPath("$.totalRequests").value(3)).andExpect(jsonPath("$.resolvedRequests").value(0))
				.andExpect(jsonPath("$.resolutionRate").value(0.0));

		verify(requestService).getSubCategoryStatistics(subCategoryId);
	}

	@Test
	void shouldSearchRequests() throws Exception {
		Page<RequestResponseDTO> page = new PageImpl<>(List.of(responseDTO), PageRequest.of(0, 10), 1);
		when(requestService.search(eq(RequestStatus.RECEIVED), eq(categoryId), eq(subCategoryId), eq(departmentId),
				eq(userId), eq(0), eq(10), eq("createdAt"), eq("desc"))).thenReturn(page);

		mockMvc.perform(get("/requests/search").param("status", RequestStatus.RECEIVED.toString())
				.param("categoryId", categoryId).param("subCategoryId", subCategoryId)
				.param("departmentId", departmentId).param("userId", userId).param("page", "0").param("size", "10")
				.param("sortBy", "createdAt").param("direction", "desc")).andExpect(status().isOk())
				.andExpect(jsonPath("$.content.size()").value(1)).andExpect(jsonPath("$.totalElements").value(1))
				.andExpect(jsonPath("$.content[0].id").value(requestId))
				.andExpect(jsonPath("$.content[0].title").value("Buraco na rua"));

		verify(requestService).search(eq(RequestStatus.RECEIVED), eq(categoryId), eq(subCategoryId), eq(departmentId),
				eq(userId), eq(0), eq(10), eq("createdAt"), eq("desc"));
	}

	@Test
	void shouldUpdateRequest() throws Exception {
		responseDTO.setTitle("Buraco na rua (atualizado)");
		responseDTO.setDescription("Buraco ainda maior, precisa de reparo urgente");

		when(requestService.update(eq(requestId), any(UpdateRequestDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/requests/{id}", requestId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(requestId))
				.andExpect(jsonPath("$.title").value("Buraco na rua (atualizado)"))
				.andExpect(jsonPath("$.description").value("Buraco ainda maior, precisa de reparo urgente"));

		verify(requestService).update(eq(requestId), any(UpdateRequestDTO.class));
	}

	@Test
	void shouldUpdateRequestStatus() throws Exception {
		responseDTO.setStatus(RequestStatus.IN_PROGRESS);

		when(requestService.updateStatus(eq(requestId), any(UpdateRequestStatusDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(patch("/requests/{id}/status", requestId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateStatusDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(requestId)).andExpect(jsonPath("$.status").value("IN_PROGRESS"));

		verify(requestService).updateStatus(eq(requestId), any(UpdateRequestStatusDTO.class));
	}

	@Test
	void shouldDeleteRequest() throws Exception {
		doNothing().when(requestService).delete(requestId);

		mockMvc.perform(delete("/requests/{id}", requestId)).andExpect(status().isNoContent());

		verify(requestService).delete(requestId);
	}
}