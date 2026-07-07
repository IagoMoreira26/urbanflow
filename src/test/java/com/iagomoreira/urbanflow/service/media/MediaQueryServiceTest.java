package com.iagomoreira.urbanflow.service.media;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@ExtendWith(MockitoExtension.class)
class MediaQueryServiceTest {

	@Mock
	private MediaRepository mediaRepository;

	@Mock
	private MediaValidationService mediaValidationService;

	@Mock
	private MediaMapper mediaMapper;

	@InjectMocks
	private MediaQueryService mediaQueryService;

	private Media media;
	private MediaResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		media = new Media();
		media.setId("media-id");
		media.setRequestId("request-id");

		responseDTO = new MediaResponseDTO();
		responseDTO.setId("media-id");
		responseDTO.setRequestId("request-id");
	}

	@Test
	void shouldFindAllMedia() {

		when(mediaRepository.findAll()).thenReturn(List.of(media));
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		List<MediaResponseDTO> result = mediaQueryService.findAll();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(mediaRepository).findAll();
		verify(mediaMapper).toResponse(media);
	}

	@Test
	void shouldFindMediaByRequest() {

		doNothing().when(mediaValidationService).validateRequest("request-id");
		when(mediaRepository.findByRequestId("request-id")).thenReturn(List.of(media));
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		List<MediaResponseDTO> result = mediaQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(mediaValidationService).validateRequest("request-id");
		verify(mediaRepository).findByRequestId("request-id");
		verify(mediaMapper).toResponse(media);
	}

	@Test
	void shouldFindMediaById() {

		when(mediaValidationService.validateMediaExists("media-id")).thenReturn(media);
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		MediaResponseDTO result = mediaQueryService.findById("media-id");
		assertThat(result).isEqualTo(responseDTO);

		verify(mediaValidationService).validateMediaExists("media-id");
		verify(mediaMapper).toResponse(media);
	}
}