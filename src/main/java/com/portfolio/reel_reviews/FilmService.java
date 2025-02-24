package com.portfolio.reel_reviews;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FilmService {

	private static List <Film> films = new ArrayList<>();
	static {
		films.add(new Film(1,"Test Film",1999, "Test Director", "Test Stars", "Test Review"));
		films.add(new Film(2, "Test Film 1", 2000,"Test ", "Sample Stars", "Sample Reviews"));
	}
	public List<Film> findAllFilms(){
		return films;
	}
}
