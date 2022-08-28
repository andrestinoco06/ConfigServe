package com.dh.sprincloud.catalogservice.model;

public class Movie {
	
	private Long id;
	private String name;
	private String genre;
	private String urlStream;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getUrlStream() {
		return urlStream;
	}
	public void setUrlStream(String urlStream) {
		this.urlStream = urlStream;
	}

}
