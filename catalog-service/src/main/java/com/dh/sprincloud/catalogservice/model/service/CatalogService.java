package com.dh.sprincloud.catalogservice.model.service;

import java.util.List;

import com.dh.sprincloud.catalogservice.model.Catalog;

public interface CatalogService {
	
	public List<Catalog> findByGenre(String genre);

}
