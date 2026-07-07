package com.iagomoreira.urbanflow.service.media;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.model.enums.MediaType;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class MediaCommandServiceTest {

	@Mock
	private MediaRepository mediaRepository;

	@Mock
	private MediaValidationService mediaValidationService;

	@Mock
	private MediaMapper mediaMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private MediaCommandService mediaCommandService;

	private CreateMediaDTO createDTO;
	private Media media;
	private MediaResponseDTO responseDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateMediaDTO();
		createDTO.setRequestId("request-id");
		createDTO.setType(MediaType.IMAGE);
		createDTO.setUrl("https://image.com/photo.jpg");

		media = new Media();
		media.setId("media-id");
		media.setRequestId("request-id");
		media.setType(MediaType.IMAGE);
		media.setUrl("https://image.com/photo.jpg");

		responseDTO = new MediaResponseDTO();
		responseDTO.setId("media-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setType(MediaType.IMAGE);
		responseDTO.setUrl("https://image.com/photo.jpg");
		responseDTO.setUploadedAt(now);
	}

	@Test
	void shouldCreateMedia() {

		doNothing().when(mediaValidationService).validateRequest(createDTO.getRequestId());

		when(mediaMapper.toEntity(createDTO)).thenReturn(media);
		when(dateTimeProvider.now()).thenReturn(now);
		when(mediaRepository.save(media)).thenReturn(media);
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		MediaResponseDTO result = mediaCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, media.getUploadedAt());

		verify(mediaValidationService).validateRequest(createDTO.getRequestId());
		verify(mediaMapper).toEntity(createDTO);
		verify(mediaRepository).save(media);
		verify(mediaMapper).toResponse(media);
	}
}