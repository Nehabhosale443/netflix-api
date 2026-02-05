package com.example.netflix;


public class Movie {

    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Genre is required")
    private String genre;

    @NotBlank(message = "Description is required")
    private String description;

    @Min(1)
    @Max(10)
    private double rating;

    @NotNull(message = "Release year is required")
    private Integer releaseYear;

    public Movie() {}

    public Movie(Long id, String title, String genre, String description, double rating, Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }
}

