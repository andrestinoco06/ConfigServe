package com.dh.sprincloud.catalogservice.model;

public class Catalog {
	
	private String genre;
	private Movie movie;
	
	public Catalog() {}
	
	public Catalog(String genre, Movie movie) {
		super();
		this.genre = genre;
		this.movie = movie;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
}
