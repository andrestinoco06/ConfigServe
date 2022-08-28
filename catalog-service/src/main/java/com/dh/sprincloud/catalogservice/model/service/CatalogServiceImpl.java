package com.dh.sprincloud.catalogservice.model.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dh.sprincloud.catalogservice.model.Catalog;
import com.dh.sprincloud.catalogservice.model.Movie;

@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	private RestTemplate clientRest;

	@Override
	public List<Catalog> findByGenre(String genre) {
		List<Movie> movies = Arrays.asList(clientRest.getForObject("http://localhost:8001/movies/{genre}", Movie[].class));
		return movies.stream().map(m -> new Catalog(genre, m)).collect(Collectors.toList());
	}

}
