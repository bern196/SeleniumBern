package com.bern.SeleniumDemoMovie.service;

import com.bern.SeleniumDemoMovie.model.Movie;
import com.bern.SeleniumDemoMovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(String rating) {
        List<Movie> movieList = movieRepository.findByRating(Integer.parseInt(rating));
        return movieList;
    }
}
