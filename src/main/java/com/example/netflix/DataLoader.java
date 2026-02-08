package com.example.netflix;

public class DataLoader {
	private MovieRepository repo;
	public void loadData() {
		repo.save(new Movie(1L,
		        "Inception",
		        "Sci-Fi",
		        "A skilled thief enters dreams to steal secrets and plant ideas.",
		        8.8,
		        2010));
		repo.save(new Movie(2L,
		        "The Dark Knight",
		        "Action",
		        "Batman faces the Joker, a criminal mastermind spreading chaos in Gotham.",
		        9.0,
		        2008));
		repo.save(new Movie( 3L,
		        "Interstellar",
		        "Sci-Fi",
		        "A team of astronauts travels through a wormhole to save humanity.",
		        8.6,
		        2014));
		repo.save(new Movie(4L,
		        "Parasite",
		        "Thriller",
		        "A poor family infiltrates a wealthy household with unexpected consequences.",
		        8.5,
		        2019));
		repo.save(new Movie(5L,
		        "Avengers: Endgame",
		        "Superhero",
		        "The Avengers unite to undo the destruction caused by Thanos.",
		        8.4,
		        2019));
	}

}
