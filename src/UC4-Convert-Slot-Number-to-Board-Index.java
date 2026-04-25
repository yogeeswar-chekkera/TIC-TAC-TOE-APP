public class TicTacToe {

    // Entry point
    public static void main(String[] args) {
        int slot = 7; // Example slot (you can change this)

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Convert slot number to row index (0–2)
    static int getRowFromSlot(int slot) {
        // (slot - 1) because slot starts from 1
        return (slot - 1) / 3;
    }

    // Convert slot number to column index (0–2)
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
