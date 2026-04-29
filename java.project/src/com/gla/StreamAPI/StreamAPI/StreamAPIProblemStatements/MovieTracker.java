package StreamAPI.StreamAPIProblemStatements;
import java.util.*;
import java.util.stream.Collectors;

class Movie {
    String title;
    double rating;
    int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }
}

public class MovieTracker {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Echoes of Time", 8.9, 2026),
                new Movie("Neon Horizon", 8.2, 2025),
                new Movie("Starlight Odyssey", 9.1, 2026),
                new Movie("The Last Archivist", 7.5, 2024),
                new Movie("Quantum Leap", 8.7, 2025),
                new Movie("Silicon Dreams", 8.4, 2026),
                new Movie("Binary Soul", 8.0, 2025)
        );

        List<Movie> top5 = movies.stream()
                .filter(m -> m.year >= 2025)
                .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed())
                .limit(5)
                .collect(Collectors.toList());

        top5.forEach(m -> System.out.println(m.title + " (" + m.year + ") - Rating: " + m.rating));
    }
}