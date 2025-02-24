package com.portfolio.reel_reviews;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmController {
	public FilmController (FilmService filmService) {
		super();
		this.filmService = filmService;
	}
	private FilmService filmService;
	
	@RequestMapping("film-list")
	public String listAllFilms(ModelMap model) {
	List<Film>films = filmService.findAllFilms();
		model.addAttribute("films", films);
		return "listFilms";
	}

}
