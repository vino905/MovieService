package com.movie.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.service.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {

}
