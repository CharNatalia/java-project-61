package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        return username;
    }
}
