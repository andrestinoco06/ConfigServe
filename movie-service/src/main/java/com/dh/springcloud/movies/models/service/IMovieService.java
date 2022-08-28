package com.dh.springcloud.movies.models.service;

import java.util.List;

import com.dh.springcloud.movies.models.entity.Movie;

public interface IMovieService {
	
	public List<Movie> findByGenre(String genre);
	public Movie save (Movie movie);

}
