import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5 + 3 = " + Addition(5, 3));
        System.out.println("5.2 + 3.5 = " + Addition(5.2, 3.5));
        System.out.println("5 - 3 = " + Subtraction(5, 3));
//        System.out.println("5.2 - 3.5 = " + Subtraction(5.2, 3.5));//returns 1.7000000002
        System.out.println("5 * 3 = " + Multiplication(5, 3));
        System.out.println("5.2 * 3.5 = " + Multiplication(5.2, 3.5));
        System.out.println("5 / 3 = " + Division(5, 3));
        System.out.println("5.2 / 3.5 = " + Division(5.2, 3.5));
        System.out.println("5 mod 3 = " + Modulus(5, 3));
//        System.out.println("5.2 mod 3.5 = " + Modulus(5.2, 3.5));//returns 1.700000002

        factorialTable();
        diceRoll();

    }
//    Basic Arithmetic
//
//    Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
    public static int Addition(int a, int b) {
        return a+b;
    }
    public static double Addition(double a, double b) {
        return a+b;
    }
//    Substraction
    public static int Subtraction(int a, int b) {
        return a-b;
    }
//    Multiplication
    public static int Multiplication(int a, int b) {
        int total = 0;
        for(int i = 1; i <= b; i++) {
            total += a;
        }
        return total;
    }
    public static double Multiplication(double a, double b) {
        return a*b;
    }
//            Division
    public static double Division(int a, int b) {
        return (double) a/ (double) b;
    }
    public static double Division(double a, double b) {
        return a/b;
    }
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Test your functions and verify the output.
//
//    Add a modulus function that finds the modulus of two numbers.
    public static int Modulus(int a, int b) {
        return a%b;
    }
//
//            Food for thought: What happens if we try to divide by zero? What should happen?

//    Create a method that validates that user input is in a certain range
//
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = scan.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Try again!");
            return getInteger(min, max);
        }
        return userInput;
    };
//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
    public static void factorial(int num){
        long factorial = 1;
        String factorialString = num + "! = ";
        for(int i = num; i >= 1; i--){
            factorial *= i;
            if(i == 1){
                factorialString += i;
            } else {
                factorialString += i + " x ";
            }
        }
        factorialString += " = " + factorial;
        System.out.println(factorialString);

    }
    public static void factorialTable(){
        Scanner scan = new Scanner(System.in);
        int userInput = getInteger(1,20);
        for(int i = 1; i <= userInput; i++) {
            factorial(i);
        }
        System.out.print("Would you like to continue? ");
        String userContinue = scan.next();
        if(userContinue.startsWith("y")){
            factorialTable();
        }
    }

//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.
    public static void diceRoll (){
        Scanner scan = new Scanner(System.in);
        int diceSides = getInteger(1, 20);
        System.out.print("Roll the " + diceSides + " sided dice? [y/n] ");
        if(scan.next().startsWith("y")){
            System.out.println(" -------   -------");
            System.out.println("|       | |       |");
            System.out.printf("|  %2d   | |  %2d   |\n", randomRoll(diceSides), randomRoll(diceSides));
            System.out.println("|       | |       |");
            System.out.println(" -------   -------");
        }
        System.out.print("Roll again? [y/n] ");
        if(scan.next().startsWith("y")){
            diceRoll();
        }
    }
    public static int randomRoll(int max) {
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }

}