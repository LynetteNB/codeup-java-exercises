import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Bob answers 'Sure.' if you ask him a question.
//        He answers 'Whoa, chill out!' if you yell at him.
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//        He answers 'Whatever.' to anything else.
        String userIn;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("What would you like to say to Bob? ");
            userIn = scan.nextLine();
            if (userIn.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userIn.equals(userIn.toUpperCase()) && !userIn.equals("") || userIn.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userIn.equalsIgnoreCase("bob")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while(!userIn.equals(""));
    }
}