package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static Input input = new Input();
    public static Movie[] movieArray= Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll().length);

    public static String getCategory(){
        String category = "unassigned";
        int categoryChosen = input.getInt(1, 6, "Enter the category:\n1 - animated\n2 - drama\n3 - horror\n4 - scifi\n5 - musical\n6 - comedy");
        switch(categoryChosen){
            case 1:
                category = "animated";
                break;
            case 2:
                category = "drama";
                break;
            case 3:
                category = "horror";
                break;
            case 4:
                category = "scifi";
                break;
            case 5:
                category = "musical";
                break;
            case 6:
                category = "comedy";
                break;
        }
        return category;
    }
    public static void displayMovie (Movie movie) {
        System.out.print(movie);
    }
    public static void displayMovies () {
        for(Movie movie : movieArray) {
            System.out.print(movie);
        }
    }
    public static void displayMovies (String category) {
        for(Movie movie : movieArray) {
            if(movie.getCategory().equals(category)) {
                System.out.print(movie);
            }
        }
    }
    public static void searchByTitle() {
        System.out.print("| Search by title: ");
        input.getString();
        String search = input.getString();
        for(Movie movie : movieArray) {
            if(movie.getName().toLowerCase().contains(search.toLowerCase())) {
                displayMovie(movie);
            }
        }
    }
    public static void modifyMovie() {
        System.out.print("| Which movie would you like to modify? ");
        int movieCount = 0;
        int movieIndex = 0;
        input.getString();

        String search = input.getString();
        for(Movie movie : movieArray) {
            if (movie.getName().toLowerCase().equals(search.toLowerCase())) {
                movieCount += 1;
                movieIndex = Arrays.binarySearch(movieArray, movie, Movie.MovieNameComparator);
                break;
            } else if (movie.getName().toLowerCase().contains(search.toLowerCase())) {
                movieCount += 1;
                movieIndex = Arrays.binarySearch(movieArray, movie, Movie.MovieNameComparator);
            }
        }
        if (movieCount == 1) {
            displayMovie(movieArray[movieIndex]);
            if (input.yesNo("Would you like to change this movie? ")) {
                input.getString();
                String newMovie = input.getString("Please enter the new title for " + movieArray[movieIndex].getName() + ": ");
                movieArray[movieIndex] = new Movie(newMovie, getCategory());
            }
        } else {
            System.out.println("<----Please be more specific in your movie title to edit.---->");
        }
    }
    public static void addNewMovie() {
        movieArray=Arrays.copyOf(movieArray, movieArray.length+1);
        input.getString();
        String movie = input.getString("Enter the name of the movie: ");
        movieArray[movieArray.length-1] = new Movie(movie, getCategory());
        movieArray[movieArray.length-1].setRating(input.getInt(0, 10, "How would you like to rate this movie? "));
    }
    public static void main(String[] args) {
        int choice;
        do {
            Arrays.sort(movieArray, Movie.MovieNameComparator);
            System.out.println("\nWhat would you like to do?\n");
            System.out.println(" ============================= ");
            System.out.printf("| 0 - %-23s |\n", "exit");
            System.out.printf("| 1 - %-23s |\n", "view all movies");
            System.out.printf("| 2 - %-23s |\n", "view animated movies");
            System.out.printf("| 3 - %-23s |\n", "view drama movies");
            System.out.printf("| 4 - %-23s |\n", "view horror movies");
            System.out.printf("| 5 - %-23s |\n", "view scifi movies");
            System.out.printf("| 6 - %-23s |\n", "view musical movies");
            System.out.printf("| 7 - %-23s |\n", "view comedy movies");
            System.out.printf("| 8 - %-23s |\n", "search movies by title");
            System.out.printf("| 9 - %-23s |\n", "modify existing movie");
            System.out.printf("| 10 - %-23s |\n", "add a new movie");
            System.out.println(" ============================= ");
            choice = input.getInt(0, 10,"\nEnter your choice: ");
            System.out.println(" ------------------------------------------------------");
            switch(choice){
                case 1:
                    displayMovies();
                    break;
                case 2:
                    displayMovies("animated");
                    break;
                case 3:
                    displayMovies("drama");
                    break;
                case 4:
                    displayMovies("horror");
                    break;
                case 5:
                    displayMovies("scifi");
                    break;
                case 6:
                    displayMovies("musical");
                    break;
                case 7:
                    displayMovies("comedy");
                    break;
                case 8:
                    searchByTitle();
                    break;
                case 9:
                    modifyMovie();
                    break;
                case 10:
                    addNewMovie();
                    break;
                default:
                    System.out.printf("%29s\n", "Buh-bye!");
            }
            System.out.println(" ------------------------------------------------------");
        } while(choice != 0);
    }

}