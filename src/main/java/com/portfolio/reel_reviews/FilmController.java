package com.portfolio.reel_reviews;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmController {
	public FilmController (FilmService filmService) {
		super();
		this.filmService = filmService;
	}
	private FilmService filmService;
	
	@RequestMapping(value = "film-list", method = RequestMethod.GET)
	public String listAllFilms(ModelMap model) {
	List<Film>films = filmService.findAllFilms();
		model.addAttribute("films", films);
		return "listFilms";
	}
	@RequestMapping(value = "add-film", method = RequestMethod.GET)
	public String showNewFilm() {
		return "film";
	}
	@RequestMapping(value = "add-film", method = RequestMethod.POST)
	public String addewFilm(@RequestParam String title, String review, String stars, int year, ModelMap model) {
		filmService.addFilm(title, year, title, stars, review);
		
		return "redirect:film-list";
	}

}
