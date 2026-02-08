package com.example.netflix;


public interface MovieRepository extends JpaRepository<Movie, Long> {

	void save(Movie movie);

}
