import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCollection {
    private final List<Movie> movies;

    public MovieCollection() {
        this.movies = new ArrayList<>();
    }

    // Add movie method
    public void addMovie(Movie movie) {
        if (findMovie(movie.getTitle()) != null) {
            System.out.println("Movie already exists: " + movie.getTitle());
            return;
        }
        movies.add(movie);
        System.out.println("Movie added: " + movie.getTitle());
    }

    // Remove movie method
    public void removeMovie(String title) {
        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Movie removed: " + title);
                return;
            }
        }
        System.out.println("Movie not found: " + title);
    }

    // Find movie method
    public Movie findMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }

    // Find movies by director
    public void findMoviesByDirector(String directorName) {
        List<Movie> directorMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDirector().getName().equalsIgnoreCase(directorName)) {
                directorMovies.add(movie);
            }
        }
        
        if (directorMovies.isEmpty()) {
            System.out.println("No movies found for director: " + directorName);
            return;
        }

        System.out.println("\nMovies directed by " + directorName + ":");
        for (Movie movie : directorMovies) {
            System.out.println(movie);
        }
    }

    // List all movies
    public void listMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in collection.");
            return;
        }

        System.out.println("\nMovie Collection:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
