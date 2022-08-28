package com.dh.springcloud.movies.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dh.springcloud.movies.models.entity.Movie;
import com.dh.springcloud.movies.models.repository.MovieRepository;

@Service
public class MovieServiceImpl implements IMovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Movie> findByGenre(String genre) {
		return (List<Movie>) movieRepository.findByGenre(genre) ;
	}

	@Override
	@Transactional(readOnly = true)
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}

}
