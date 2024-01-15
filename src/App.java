
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text-based Adventure Game!");
        System.out.println("You find yourself in a mysterious world...");

        // Start your story here
        System.out.println("Choose an option:");
        System.out.println("1. Go left");
        System.out.println("2. Go right");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You chose to go left. You encounter a friendly creature.");
            // Continue the story based on this path...
        } else {
            System.out.println("You chose to go right. You face a challenging obstacle.");
            // Continue the story based on this path...
        }

        // You can continue adding more decision points and branching paths

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
