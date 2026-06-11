package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.service.LegislationService;

@RestController
@RequestMapping("/legislations")
public class LegislationController {

	@Autowired
	private LegislationService legislationService;

	@GetMapping
	public List<LegislationResponseDTO> findAll() {
		return legislationService.findAll();
	}

	@GetMapping("/{id}")
	public LegislationResponseDTO findById(@PathVariable String id) {
		return legislationService.findById(id);
	}

	@GetMapping("/search")
	public List<LegislationResponseDTO> findByKeyword(@RequestParam String keyword) {
		return legislationService.findByKeyword(keyword);
	}
}