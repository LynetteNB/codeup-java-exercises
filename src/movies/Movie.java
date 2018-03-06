package movies;
import java.util.Comparator;

public class Movie {
    private String name;
    private String category;
    private int rating;


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("| %-36s | %-8s | %-2d |\n", name, category, rating);
    }

    public static Comparator<Movie> MovieNameComparator
            = new Comparator<Movie>() {

        public int compare(Movie movie1, Movie movie2) {

            String movieTitle1 = movie1.getName().replaceAll("^(?i)The ", "").toLowerCase();
            String movieTitle2 = movie2.getName().replaceAll("^(?i)The ", "").toLowerCase();
            return movieTitle1.compareTo(movieTitle2);
        }

    };
}