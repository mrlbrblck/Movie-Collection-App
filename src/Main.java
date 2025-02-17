import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieCollection collection = new MovieCollection();
        try (Scanner scanner = new Scanner(System.in)) {
            String command;

            System.out.println("Welcome to the Movie Collection!");
            while (true) {
                try {
                    System.out.println("\nEnter a command (add, remove, find, director's list, list, quit):");
                    command = scanner.nextLine().trim();

                    if (command.equalsIgnoreCase("add")) {
                        System.out.println("Enter the title of the movie:");
                        String title = scanner.nextLine().trim();
                        if (title.isEmpty()) {
                            throw new IllegalArgumentException("Title cannot be empty.");
                        }

                        System.out.println("Enter the director's name:");
                        String directorName = scanner.nextLine().trim();
                        if (directorName.isEmpty()) {
                            throw new IllegalArgumentException("Director name cannot be empty.");
                        }
                        Person director = new Person(directorName);

                        int year = 0;
                        while (true) {
                            try {
                                System.out.println("Enter the year of the movie:");
                                year = Integer.parseInt(scanner.nextLine().trim());
                                if (year < 1800 || year > 2100) {
                                    throw new IllegalArgumentException("Please enter a realistic year (1800-2100).");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid year.");
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        System.out.println("Enter the genre of the movie:");
                        String genre = scanner.nextLine().trim();
                        if (genre.isEmpty()) {
                            throw new IllegalArgumentException("Genre cannot be empty.");
                        }

                        Movie movie = new Movie(title, director, year, genre);
                        collection.addMovie(movie);

                    } else if (command.equalsIgnoreCase("remove")) {
                        System.out.println("Enter the title of the movie:");
                        String title = scanner.nextLine().trim();
                        collection.removeMovie(title);

                    } else if (command.equalsIgnoreCase("find")) {
                        System.out.println("Enter the title of the movie:");
                        String title = scanner.nextLine().trim();
                        Movie movie = collection.findMovie(title);
                        if (movie != null) {
                            System.out.println(movie);
                        } else {
                            System.out.println("Movie not found: " + title);
                        }

                    } else if (command.equalsIgnoreCase("director's list")) {
                        System.out.println("Enter the director's name:");
                        String directorName = scanner.nextLine().trim();
                        collection.findMoviesByDirector(directorName);

                    } else if (command.equalsIgnoreCase("list")) {
                        collection.listMovies();

                    } else if (command.equalsIgnoreCase("quit")) {
                        System.out.println("Exiting program...");
                        break;

                    } else {
                        System.out.println("Invalid command: " + command);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
        }
    }
}
