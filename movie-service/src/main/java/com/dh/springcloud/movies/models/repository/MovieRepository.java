package com.dh.springcloud.movies.models.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dh.springcloud.movies.models.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByGenre(String genre);

}
