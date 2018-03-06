package movies;
import java.util.Comparator;

public class Movie {
    private String name;
    private String category;

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
    public static Comparator<Movie> MovieNameComparator
            = new Comparator<Movie>() {

        public int compare(Movie movie1, Movie movie2) {

            String movieTitle1 = movie1.getName().replaceAll("^(?i)The ", "").toLowerCase();
            String movieTitle2 = movie2.getName().replaceAll("^(?i)The ", "").toLowerCase();
            //ascending order
            return movieTitle1.compareTo(movieTitle2);
        }

    };
}