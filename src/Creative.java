
import java.util.Scanner;

public class Creative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("You find yourself in a magical land full of mysteries...");

        // Start your story here
        System.out.println("As you walk through the enchanted forest, you encounter a fork in the path.");
        System.out.println("What do you want to do?");
        System.out.println("1. Explore the left path");
        System.out.println("2. Take the right path");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You chose to explore the left path. A hidden waterfall reveals a secret passage!");
            // Continue the story based on this path...
        } else {
            System.out.println("You chose to take the right path. You stumble upon a mysterious ancient temple.");
            // Continue the story based on this path...
        }

        // You can continue adding more decision points and branching paths

        System.out.println("Thanks for playing the Adventure Game!");
        scanner.close();
    }

    private static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = -1;
        do {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > maxChoice) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid choice.");
                scanner.next(); // consume the invalid input
            }
        } while (choice < 1 || choice > maxChoice);

        return choice;
    }
}
