import java.util.Scanner;//imported scanner class from java.util package

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt;
        System.out.print("Enter an Integer: ");
        userInt = scan.nextInt();
        System.out.println("You inputted: " + userInt);

        String userWord1, userWord2, userWord3;
        System.out.print("Enter three words: ");
        userWord1 = scan.next();
        userWord2 = scan.next();
        userWord3 = scan.next();
        System.out.println(userWord1 + "\n" + userWord2 + "\n" + userWord3);

        scan.nextLine();//so that the scanner can grab onto the previous enter key (\n) and not skip the next input

        String userString;
        System.out.print("Enter a sentence: ");
        userString = scan.nextLine();
        System.out.println("This is your sentence: \"" + userString + "\"");


        double length, width, height;
        System.out.print("Enter the length of the classroom: ");
        length = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the width of the classroom: ");
        width = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the height of the classroom: ");
        height = Double.parseDouble(scan.nextLine());

//        System.out.print("Enter the length, width, and height of the classroom separated by a space: ");
//        length = scan.nextDouble();
//        width = scan.nextDouble();
//        height = scan.nextDouble();

        System.out.println("The area of the classroom with a length of " + length + " and a width of " + width + " is: " + (length*width) + ".");
        System.out.println("The perimeter of the classroom with a length of " + length + " and a width of " + width + " is: " + (2*length+width*2) + ".");
        System.out.println("The volume of the classroom with a length of " + length + ", width of " + width + ", and a height of " + height + " is: " + (height*length*width) + ".");
    }
}
