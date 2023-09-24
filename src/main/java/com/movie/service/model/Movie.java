package com.movie.service.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="movies")
public class Movie {
	@Id
	private String id;
	private String movieName;
	private String movieLaunchMonth;
	private String movieCast;

}
