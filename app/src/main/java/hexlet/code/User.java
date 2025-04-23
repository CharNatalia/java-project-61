package hexlet.code;

import java.util.Scanner;

public class User {
    private String name;

    User() {
        this.name = null;
    }

    public String getName() {
        if (name == null) {
            name = askName();
        }
        return name;
    }

    private static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        return scanner.nextLine();
    }
}
