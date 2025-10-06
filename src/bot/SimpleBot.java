package bot;
import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greet("Aid", "2025");
        remindName();
        guessAge();
        count();

        System.out.println("Completed, have a nice day!");
        scanner.close();
    }

    public static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("My birth year is " + birthYear);
        System.out.println("Please, remind me your name.");
    }
    public static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
    }

    public static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int countNumber = scanner.nextInt();
        for (int i = 0; i <= countNumber; i++) {
            System.out.println(i + "!");
        }
    }
}
