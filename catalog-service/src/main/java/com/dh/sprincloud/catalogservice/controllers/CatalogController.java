package com.dh.sprincloud.catalogservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.sprincloud.catalogservice.model.Catalog;
import com.dh.sprincloud.catalogservice.model.service.CatalogService;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@Autowired
	@Qualifier("serviceFeign")
	private CatalogService catalogService;
	
	@GetMapping("/{genre}")
	ResponseEntity<List<Catalog>> getMovieByGenre(@PathVariable String genre) {
		return ResponseEntity.ok().body(catalogService.findByGenre(genre));
	}

}
