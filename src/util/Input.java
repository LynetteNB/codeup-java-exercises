package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }
    public Boolean yesNo() {
        String check = scanner.next();
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
        if(check.equalsIgnoreCase("Y") || check.startsWith("y") || check.startsWith("Y")) {
            return true;
        } else {
            return false;
        }
    }
    public int getInt(int min, int max) {
//    The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
        System.out.print("Please enter an integer between " + min + " and " + max + ": ");
        int check = scanner.nextInt();
        if(check < min || check > max) {
            return getInt(min, max);
        } else {
            return check;
        }
    }
    public int getInt(){
        return scanner.nextInt();
    }
    public double getDouble(double min, double max) {
//    The getDouble method should do the same thing, but with decimal numbers.
        System.out.print("Please enter any real number between " + min + " and " + max + ": ");
        double check = scanner.nextDouble();
        if(check < min || check > max) {
            return getDouble(min, max);
        } else {
            return check;
        }
    }
    public double getDouble(){
        return scanner.nextDouble();
    }

    //With PROMPT parameter
    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public Boolean yesNo(String prompt) {
        System.out.print(prompt);
        String check = scanner.next();
        if(check.equalsIgnoreCase("Y") || check.startsWith("y") || check.startsWith("Y")) {
            return true;
        } else {
            return false;
        }
    }
    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        System.out.print("Please enter an integer between " + min + " and " + max + ": ");
        int check = scanner.nextInt();
        if(check < min || check > max) {
            return getInt(min, max);
        } else {
            return check;
        }
    }
    public int getInt(String prompt){
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        System.out.print("Please enter any real number between " + min + " and " + max + ": ");
        double check = scanner.nextDouble();
        if(check < min || check > max) {
            return getDouble(min, max);
        } else {
            return check;
        }
    }
    public double getDouble(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}