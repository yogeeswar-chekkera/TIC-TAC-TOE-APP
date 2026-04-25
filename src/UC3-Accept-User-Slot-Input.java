#include <iostream>
using namespace std;

/*
 * TicTacToe
 * UC3 reads a slot number (1–9) entered by the user.
 * This use case focuses only on input handling without validation.
 */

class TicTacToe {
public:

    /*
     * Entry point of the program.
     * Reads slot input and prints it back
     * to verify correct user input handling.
     */
    static void run() {
        int slot = getUserSlot();
        cout << "Slot entered: " << slot << endl;
    }

    /*
     * Reads an integer slot value from the user.
     * Output: Slot number (1–9)
     * (No validation included here)
     */
    static int getUserSlot() {
        int slot;
        cout << "Enter a slot number (1-9): ";
        cin >> slot;
        return slot;
    }
};

int main() {
    TicTacToe::run();
    return 0;
}