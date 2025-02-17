public class Movie {
    private final String title;
    private final Person director;
    private final int year;
    private final String genre;

    public Movie(String title, Person director, int year, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") - Directed by " + director.getName() + " - Genre: " + genre;
    }

    public String getTitle() {
        return title;
    }

    public Person getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
