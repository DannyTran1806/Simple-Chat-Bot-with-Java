package bot;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String botName = "JARVIS";
        String birthYear = "2025";
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
        System.out.print("> ");
        String name = input.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        input.close();
    }
}
