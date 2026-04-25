import java.util.Scanner;

public class TicTacToe {

    // Entry point of the program
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // Method to get user slot input (1–9)
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        System.out.print("Enter a slot number (1-9): ");

        // Read input
        slot = scanner.nextInt();

        // (Basic version as per requirement – no validation loop)
        return slot;
    }
}
