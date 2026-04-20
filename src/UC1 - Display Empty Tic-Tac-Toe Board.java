public class TicTacToe {

    // 3x3 board
    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize the board
        initializeBoard();

        // Print the board
        printBoard();
    }

    // Method to initialize the board with '-'
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Method to print the board
    static void printBoard() {
        System.out.println("Tic-Tac-Toe Board:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

                // Print vertical separator
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            // Print horizontal separator
            if (i < 2) {
                System.out.println("--+---+--");
            }
        }
    }
}
