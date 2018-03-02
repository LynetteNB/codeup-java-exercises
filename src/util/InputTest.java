package util;

public class InputTest {
    public static void main(String[] args) {
        Input scanner = new Input();

        System.out.println(scanner.getDouble("Give me a double! "));
        System.out.println(scanner.getInt("Give me an int! "));
        System.out.println(scanner.getDouble(1.2, 10.7, "Give me a double!"));
        System.out.println(scanner.getInt(3, 13, "Give me an int!"));
        System.out.println(scanner.yesNo("Would you like to continue?"));
        scanner.getString();
        System.out.println(scanner.getString("Give me a string! "));

    }
}