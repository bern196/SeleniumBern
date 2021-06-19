package com.bern.SeleniumDemoMovie.controller;

import com.bern.SeleniumDemoMovie.dto.MovieDto;
import com.bern.SeleniumDemoMovie.model.Movie;
import com.bern.SeleniumDemoMovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @ModelAttribute("movieDto")
    public MovieDto movieDto() {
        return new MovieDto();
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        return "Home";
    }

    @PostMapping("/home")
    public String filterHome(@ModelAttribute("movieDto") MovieDto movieDto, Model model) {

        List<Movie> movieList = movieService.getMovies(movieDto.getRating());
        model.addAttribute("movieList", movieList);
        // return "redirect:/flight";
        return "SearchResult";
    }

    @GetMapping("/searchResult")
    public String showSearchResult(Model model) {
        return "Home";
    }
}
