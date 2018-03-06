package movies;
import util.Input;
import java.util.Arrays;
import java.util.Collections;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        int choice;
        Movie[] movieArray= Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll().length);
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
            System.out.printf("| 7 - %-23s |\n", "search movies by title");
            System.out.printf("| 8 - %-23s |\n", "modify an existing movie");
            System.out.printf("| 9 - %-23s |\n", "add a new movie");
            System.out.println(" ============================= ");
            choice = input.getInt(0, 9,"\nEnter your choice: ");
            System.out.println(" -------------------------------------------------");
            switch(choice){
                case 1:
                    for(Movie movie : movieArray) {
                        displayMovies(movie);
                    }
                    break;
                case 2:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory().equals("animated")) {
                            displayMovies(movie);
                        }
                    }
                    break;
                case 3:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory().equals("drama")) {
                            displayMovies(movie);
                        }
                    }
                    break;
                case 4:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory().equals("horror")) {
                            displayMovies(movie);
                        }
                    }
                    break;
                case 5:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory().equals("scifi")) {
                            displayMovies(movie);
                        }
                    }
                    break;
                case 6:
                    for(Movie movie : movieArray) {
                        if(movie.getCategory().equals("musical")) {
                            displayMovies(movie);
                        }
                    }
                    break;
                case 7:
                    System.out.print("| Search by title: ");
                    input.getString();
                    String search = input.getString();
                    for(Movie movie : movieArray) {
                        if(movie.getName().toLowerCase().contains(search.toLowerCase())) {
                            displayMovies(movie);
                        }
                    }
                    break;
                case 8:
                    System.out.print("| Which movie would you like to modify? ");
                    int movieCount = 0;
                    int movieIndex = 0;
                    input.getString();

                    search = input.getString();
                    System.out.println(search);
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
                        displayMovies(movieArray[movieIndex]);
                        if (input.yesNo("Would you like to change this movie? ")) {
                            input.getString();
                            String category = "unassigned";
                            String newMovie = input.getString("Please enter the new title for " + movieArray[movieIndex].getName() + ": ");
//                            input.getString();
                            movieArray[movieIndex] = new Movie(newMovie, getCategory());
                        }
                    } else {
                        System.out.println("Please be more specific in your movie to edit.");
                    }
                    break;
                case 9:
                    movieArray=Arrays.copyOf(movieArray, movieArray.length+1);
                    String category = "Unassigned";
                    input.getString();
                    String movie = input.getString("Enter the name of the movie: ");
                    movieArray[movieArray.length-1] = new Movie(movie, getCategory());
                    break;
                default:
                    System.out.printf("%29s\n", "Buh-bye!");
            }
            System.out.println(" -------------------------------------------------");
        } while(choice != 0);
    }
    public static void displayMovies (Movie movie) {
        System.out.printf("| %-36s | %-8s |\n", movie.getName(), movie.getCategory());
    }
    public static String getCategory(){
        Input input = new Input();
        String category = "unassigned";
        int categoryChosen = input.getInt(1, 5, "Enter the category:\n1 - animated\n2 - drama\n3 - horror\n4 - scifi\n5 - musical");
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
        }
        return category;
    }
}