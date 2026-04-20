public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Randomly decide who starts and assign symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display the result of toss
    static void displayTossResult() {
        System.out.println("Toss Result:");

        if (isHumanTurn) {
            System.out.println("Human plays first!");
        } else {
            System.out.println("Computer plays first!");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}