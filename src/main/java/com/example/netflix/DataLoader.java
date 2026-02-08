package com.example.netflix;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
	
	
	
	
	private  final MovieService movieService;
	
	public DataLoader(MovieService movieService) {
		this.movieService= movieService;
	}
	
	@Override
	public void run(String... args) {
		
		movieService.addMovie(new Movie(1L,
		        "Inception",
		        "Sci-Fi",
		        "A skilled thief enters dreams to steal secrets and plant ideas.",
		        8.8,
		        2010));
		movieService.addMovie(new Movie(2L,
		        "The Dark Knight",
		        "Action",
		        "Batman faces the Joker, a criminal mastermind spreading chaos in Gotham.",
		        9.0,
		        2008));
		movieService.addMovie(new Movie( 3L,
		        "Interstellar",
		        "Sci-Fi",
		        "A team of astronauts travels through a wormhole to save humanity.",
		        8.6,
		        2014));
		movieService.addMovie(new Movie(4L,
		        "Parasite",
		        "Thriller",
		        "A poor family infiltrates a wealthy household with unexpected consequences.",
		        8.5,
		        2019));
		movieService.addMovie(new Movie(5L,
		        "Avengers: Endgame",
		        "Superhero",
		        "The Avengers unite to undo the destruction caused by Thanos.",
		        8.4,
		        2019));
	}
	

}
