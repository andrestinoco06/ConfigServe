package com.dh.sprincloud.catalogservice.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dh.sprincloud.catalogservice.model.Movie;

@FeignClient(name="movie-service")
public interface MovieClientRest {
	
	@GetMapping("/movies/{genre}")
	public List<Movie> getMovieByGenre(@PathVariable String genre);

}
