package com.portfolio.reel_reviews;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class FilmService {

	private static List<Film> films = new ArrayList<>();
	private static int filmCount = 0;
	static {
		films.add(new Film(++filmCount, "Test Film", 1999, "Test Director", "Test Stars", "Test Review"));
		films.add(new Film(++filmCount, "Test Film 1", 2000, "Test ", "Sample Stars", "Sample Reviews"));
	}

	public List<Film> findAllFilms() {
		return films;
	}

	public void addFilm(String title, int year, String director, String star, String review) {
		Film film = new Film(++filmCount, title, year, director, star, review);
		films.add(film);
	}

	public void deleteById(int id) {
		Predicate<? super Film> predicate = film -> film.getId() == id;
		films.removeIf(predicate);
	}

	public Film findFilmById(int id) {
		Predicate<? super Film> predicate = film -> film.getId() == id;
		Film film = films.stream().filter(predicate).findFirst().get();
		return film;
	}

	public void updateById(@Valid Film film) {
		deleteById(film.getId());
		System.out.print(film);
		films.add(film);
	}
}
