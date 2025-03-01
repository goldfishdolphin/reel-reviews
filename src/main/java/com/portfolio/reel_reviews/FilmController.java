package com.portfolio.reel_reviews;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;


@Controller
public class FilmController {
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}

	private FilmService filmService;

	@RequestMapping(value = "film-list", method = RequestMethod.GET)
	public String listAllFilms(ModelMap model) {
		List<Film> films = filmService.findAllFilms();
		model.addAttribute("films", films);
		return "listFilms";
	}

	@RequestMapping(value = "add-film", method = RequestMethod.GET)
	public String showNewFilm(ModelMap model) 
	{ 
		Film film = new Film(0, "New film",2017, "Sample", "Testing Stars", "sample Reviews are here!" );
		model.put("film", film);
		return "film";
	}

	@RequestMapping(value = "add-film", method = RequestMethod.POST)
	public String addNewFilm( ModelMap model, @Valid Film film, BindingResult result) {
		if (result.hasErrors()) {
			return "film";
		}
		filmService.addFilm(film.getTitle(), film.getYear(), film.getDirector(), film.getStar(), film.getReview());
		return "redirect:film-list";

	}

	@RequestMapping("delete-film")
	public String deleteFilm(@RequestParam int id) {
		filmService.deleteById(id);
		return "redirect:film-list";
	}

//	@RequestMapping(value = "update-film", method = RequestMethod.GET)
//	public String showUpdateFilm(@RequestParam int id, ModelMap model) {
//		return "film";
//	}
//	
//	@RequestMapping(value = "update-film", method = RequestMethod.POST)
//	public String updateFilm(ModelMap model, @Valid Film film, BindingResult result) {
//		if (result.hasErrors()) {
//			return "film";
//		}
//		filmService.addFilm(film.getTitle(), film.getYear(), film.getDirector(), film.getStars(), film.getReview());
//		return "redirect:film-list";
//	}
	
}
