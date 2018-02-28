import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);
//        Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);
//        refactor the previous two exercises to use a for loop instead
//        for(int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }
//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }
//        for(long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }

//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.
//        for(int i = 1; i <= 100; i++){
//            if(i%3 == 0 && i%5 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            else if(i%3 == 0){
//                System.out.println("Fizz");
//                continue;
//            }
//            else if(i%5 == 0){
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }

//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        int userInt;
        Scanner scan = new Scanner(System.in);
//        char userContinue;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            userInt = scan.nextInt();
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//            int i = 1;
//            do {
//                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//                i++;
//            } while (i <= userInt);
//            System.out.print("Would you like to continue? [y/n] ");
//            userContinue = scan.next().charAt(0);
//        } while(userContinue == 'y');

//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        char userContinue;
        int grade;
        do {
            System.out.println("What is the numerical grade? ");
            grade = scan.nextInt();
            if (grade <= 59) {
                System.out.println("F");
            } else if (grade <= 66) {
                System.out.println("D");
            } else if (grade <= 71) {
                System.out.println("C-");
            } else if (grade <= 75) {
                System.out.println("C");
            } else if (grade <= 79) {
                System.out.println("C+");
            } else if (grade <= 85) {
                System.out.println("B-");
            } else if (grade <= 87) {
                System.out.println("B");
            } else if (grade <= 90) {
                System.out.println("B+");
            } else if (grade <= 94) {
                System.out.println("A-");
            } else if (grade <= 98) {
                System.out.println("A");
            } else if (grade <= 100) {
                System.out.println("A+");
            }
            System.out.println("Would you like to continue? [y/n] ");
            userContinue = scan.next().charAt(0);
        } while (userContinue == 'y');

//        ================================= CONTROL STRUCTURES BONUSES
//        1. Prompt the user to enter an integer between 1 and 7 and output the day of the week it maps to (Sunday is 1 and Saturday is 7)
//        2. Prompt the user for an integer. Output whether or not the number is prime.
//        3. Prompt the user to enter an integer and output all the days of the week that
//        have no more letters than the integer given.
//        4. Prompt the user to enter their name. Output whether the name is
//                - short (less than 4 characters), medium (less than 9), long (more than 8)
//        - contains the letter 'y'
//                - is a palindrome
//        5. Print out all times from 1:00am to 12:00pm.
//                Example:
//        1:00am
//        1:01am
//        1:02am
//        etc.
//                this will help you for this bonus...
//        https://stackoverflow.com/questions/12421444/how-to-format-a-number-0-9-to-display-with-2-digits-its-not-a-date


//        ================================= CONSOLE IO BONUSES
//        BONUS 1
//        Prompt the user to enter a favorite quote
//        Output the quote
//        Ask them to enter how many words are in the sentence
//        Output the number they entered
//        BONUS 2
//        Prompt the user to enter a list of top three favorite foods separated by only spaces
//        Use the printf() to output there three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood
//        BONUS 3
//        Prompt the user to enter a grocery list of three items
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
//        Output the result as a comma-separated list using printf()
    }
}