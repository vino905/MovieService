package com.movie.service.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.service.exception.ResourceNotFoundException;
import com.movie.service.model.Movie;
import com.movie.service.repositories.MovieRepository;
import com.movie.service.services.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepo;
	
	@Override
	public Movie create(Movie movie) {
		String randomMovieId= UUID.randomUUID().toString();
		movie.setId(randomMovieId);
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(String id) {
		// TODO Auto-generated method stub
		return movieRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Movie details with given id is not availabele") );
	}

}
