package com.dh.springcloud.movies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dh.springcloud.movies.models.service.IMovieService;
import com.dh.springcloud.movies.models.entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private IMovieService movieService;
	
	@GetMapping("/{genre}")
	ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable String genre) {
		return ResponseEntity.ok().body(movieService.findByGenre(genre));
	}
	
	@PostMapping("/save")
	ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
		return ResponseEntity.ok().body(movieService.save(movie));
	}

}
