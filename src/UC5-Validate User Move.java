#include <iostream>
using namespace std;

/*
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */

class TicTacToe {
public:
    // 3x3 board initialized with empty cells ('-')
    static char board[3][3];

    /*
     * Entry point of the program.
     * Tests the validation logic using sample row and column values.
     */
    static void run() {
        int row = 1, col = 1; // Example position

        if (isValidMove(row, col)) {
            cout << "Move is valid" << endl;
        } else {
            cout << "Move is invalid" << endl;
        }
    }

    /*
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: row, col
     * Output: true if valid, false otherwise
     */
    static bool isValidMove(int row, int col) {
        // Boundary check (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
};

// Initialize static board
char TicTacToe::board[3][3] = {
    {'-', '-', '-'},
    {'-', '-', '-'},
    {'-', '-', '-'}
};

int main() {
    TicTacToe::run();
    return 0;
}