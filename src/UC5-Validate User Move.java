public class TicTacToe {

    // 3x3 board initialized with empty cells '-'
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    // Entry point
    public static void main(String[] args) {

        int row = 1;  // Example input
        int col = 1;

        if (isValidMove(row, col)) {
            System.out.println("Valid move!");
        } else {
            System.out.println("Invalid move!");
        }
    }

    // Method to validate the move
    static boolean isValidMove(int row, int col) {

        // Check boundary (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}
