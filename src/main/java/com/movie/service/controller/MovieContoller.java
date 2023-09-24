package com.movie.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.service.model.Movie;
import com.movie.service.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieContoller {
	
	@Autowired
	private MovieService movieService;
	
//	for creating the movie
	@PostMapping
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
		Movie res= movieService.create(movie);
		return ResponseEntity.status(HttpStatus.CREATED).body(res);
	}
	
	//for getting the movie by id
	@GetMapping("/getMovieById/{movieId}")
	public ResponseEntity<Movie>getMovieById(@PathVariable String movieId){
		Movie res= movieService.getMovieById(movieId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
		
	}
	
	//for getting all the movies details
	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovie(){
		List<Movie> res= movieService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}

}
