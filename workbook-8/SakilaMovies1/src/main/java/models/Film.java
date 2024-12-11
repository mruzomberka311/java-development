package models;

public class Film {
    private int filmId;
    private String title;
    private String description;
    private String releaseYear;
    private String length;


    public Film(int filmId, String title, String description, String releaseYear, String length) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getLength() {
        return length;
    }
}
