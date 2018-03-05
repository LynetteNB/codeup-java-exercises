package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
//
//        Frankenstein -- horror
//        Goodfellas -- drama
//        Pulp Fiction -- drama
        int choice;
        Movie[] movieArray= Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll().length);
        do {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println(" ========================================== ");
            System.out.printf("| 0 - %-36s |\n", "exit");
            System.out.printf("| 1 - %-36s |\n", "view all movies");
            System.out.printf("| 2 - %-36s |\n", "view movies in the animated category");
            System.out.printf("| 3 - %-36s |\n", "view movies in the drama category");
            System.out.printf("| 4 - %-36s |\n", "view movies in the horror category");
            System.out.printf("| 5 - %-36s |\n", "view movies in the scifi category");
            System.out.printf("| 6 - %-36s |\n", "view movies in the musical category");
            System.out.printf("| 7 - %-36s |\n", "add a new movie");
            System.out.println(" ========================================== ");
            choice = input.getInt("\nEnter your choice: ");
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
                    movieArray=Arrays.copyOf(movieArray, movieArray.length+1);
                    String category = "Unassigned";
                    input.getString();
                    String movie = input.getString("Enter the name of the movie: ");
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
                    movieArray[movieArray.length-1] = new Movie(movie, category);
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
}