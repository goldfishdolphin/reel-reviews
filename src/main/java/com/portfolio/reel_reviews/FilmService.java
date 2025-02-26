package com.portfolio.reel_reviews;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FilmService {

	private static List <Film> films = new ArrayList<>();
	private static int filmCount = 0;
	static {
		films.add(new Film(++filmCount,"Test Film",1999, "Test Director", "Test Stars", "Test Review"));
		films.add(new Film(++filmCount, "Test Film 1", 2000,"Test ", "Sample Stars", "Sample Reviews"));
	}
	public List<Film> findAllFilms(){
		return films;
	}
	public void addFilm(String title, int year,  String director, String star, String review ) {
		Film film = new Film(++filmCount, title, year, director, star, review );
		films.add(film);
	}
}
