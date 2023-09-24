package com.movie.service.services;

import java.util.List;

import com.movie.service.model.Movie;

public interface MovieService {

	//create
	Movie create(Movie movie);
	
//	for getting all the movies
	
	List<Movie> getAll();
	
	// get movie by id
	
	Movie getMovieById(String id);
	
	
}
