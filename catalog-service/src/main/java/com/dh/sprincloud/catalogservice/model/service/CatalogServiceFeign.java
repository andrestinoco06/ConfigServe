package com.dh.sprincloud.catalogservice.model.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.dh.sprincloud.catalogservice.clients.MovieClientRest;
import com.dh.sprincloud.catalogservice.model.Catalog;

@Service("serviceFeign")
@Primary
public class CatalogServiceFeign implements CatalogService {
	
	@Autowired
	private MovieClientRest clientFeign;

	@Override
	public List<Catalog> findByGenre(String genre) {
		
		return clientFeign.getMovieByGenre(genre).stream().map(m -> new Catalog(genre, m)).collect(Collectors.toList());
	}

}
