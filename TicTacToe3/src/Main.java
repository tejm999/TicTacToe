import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            Player player1 = new Player('X', scanner);
            Player player2 = new Player('O', scanner);

            GameState.setGameOver(false);

            while (!GameState.isGameOver()) {
                player1.makeMove();
                if (GameState.isGameOver()) break;
                player2.makeMove();
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } while (playAgain);

        scanner.close();
    }
}
