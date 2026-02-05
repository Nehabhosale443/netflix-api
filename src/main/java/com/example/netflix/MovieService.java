package com.example.netflix;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();
    private long nextId = 1;

    public Movie addMovie(Movie movie) {
        movie.setId(nextId++);
        movies.add(movie);
        return movie;
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Optional<Movie> getMovieById(Long id) {
        return movies.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst();
    }

    public boolean deleteMovie(Long id) {
        return movies.removeIf(m -> m.getId().equals(id));
    }
}

