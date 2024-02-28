
import java.util.Scanner;

public class Player {
    private final char symbol;
    private final Scanner scanner;
    private int wins;

    public Player(char symbol, Scanner scanner) {
        this.symbol = symbol;
        this.scanner = scanner;
    }

    public void makeMove() {
        Board.displayBoard();
        int move;
        do {
            System.out.print("Player " + symbol + ", enter your move (1-9): ");
            move = scanner.nextInt();
        } while (!Move.isValidMove(move));
        Move.makeMove(move, symbol);
        if (Board.checkWin(symbol)) {
            Board.displayBoard();
            System.out.println("Player " + symbol + " wins!");
            wins++;
            System.out.println("Player " + symbol + " wins: " + wins);
            GameState.setGameOver(true);
        } else if (Board.checkDraw()) {
            Board.displayBoard();
            System.out.println("It's a draw!");
            GameState.setGameOver(true);
        }
    }
}
