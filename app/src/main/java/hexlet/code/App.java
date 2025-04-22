package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "0 - Exit");

        int num = scanner.nextInt();

        System.out.println("Your choice: " + num);
        if (num != 0) {
            Cli.sayHi();
        }
    }
}
