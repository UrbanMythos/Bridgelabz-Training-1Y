package JavaCollection_Assignement;
import java.util.*;

class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String toString() {
        return title + " (" + genre + ")";
    }
}

public class StreamingWatchSystem {
    public static void main(String[] args) {

        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Inception", "SciFi"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Batman", "Action"));

        Stack<Movie> history = new Stack<>();
        Queue<Movie> upNext = new LinkedList<>();
        Set<String> genres = new HashSet<>();

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));
        upNext.add(allMovies.get(2));

        while (!upNext.isEmpty()) {
            Movie m = upNext.remove();
            history.push(m);
            genres.add(m.genre);
        }

        System.out.println("Watch History:");
        for (Movie m : history) {
            System.out.println(m);
        }

        System.out.println("\nRecommended Movies:");
        for (Movie m : allMovies) {
            if (genres.contains(m.genre)) {
                System.out.println(m);
            }
        }
    }
}