package com.bern.SeleniumDemoMovie;

import com.bern.SeleniumDemoMovie.model.Movie;
import com.bern.SeleniumDemoMovie.repository.MovieRepository;
import com.bern.SeleniumDemoMovie.service.MovieService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeleniumDemoMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeleniumDemoMovieApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(MovieRepository movieRepository) {
		return args -> {
			movieRepository.save(new Movie("Nice", "adasda", 2));
			movieRepository.save(new Movie("Nice1", "adasda", 4));
			movieRepository.save(new Movie("Nice2", "adasda", 3));
			movieRepository.save(new Movie("Nice3", "adasda", 1));
			movieRepository.save(new Movie("Nice4", "adasda", 3));

		};
	}
}
