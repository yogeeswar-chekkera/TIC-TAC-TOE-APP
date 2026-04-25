#include <iostream>
using namespace std;

/*
 * TicTacToe
 * UC4 converts a user-entered slot number (1–9) into corresponding
 * row and column indices of a 3x3 board.
 */

class TicTacToe {
public:

    /*
     * Entry point of the program.
     * Demonstrates slot-to-index conversion using a sample slot value.
     */
    static void run() {
        int slot = 7;  // Example slot

        cout << "Row: " << getRowFromSlot(slot) << endl;
        cout << "Column: " << getColFromSlot(slot) << endl;
    }

    /*
     * Converts slot number into row index using zero-based indexing.
     * Input: Slot number (1–9)
     * Output: Row index (0–2)
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /*
     * Converts slot number into column index using modulo operation.
     * Input: Slot number (1–9)
     * Output: Column index (0–2)
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
};

int main() {
    TicTacToe::run();
    return 0;
}