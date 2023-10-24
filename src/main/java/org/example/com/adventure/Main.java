package main.java.org.example.com.adventure;

public class Main {
    private static GameController controller = new GameController();
    public static void main(String[] args) {
        System.out.println("Welcome to the Coding Adventure Game");
        System.out.println("Your goal is to add code to the game that satisfies the requirements");

        controller.printHelp();

        System.out.println("you can type \"help\" at any time for a list of commands");

        System.out.println("Whenever you're ready, press the return key.");

        scanner.nextLine();

        controller.startGame();
    }
}