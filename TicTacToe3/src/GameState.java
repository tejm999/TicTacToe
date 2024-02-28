
public class GameState {
    private static boolean gameOver;

    public static boolean isGameOver() {
        return gameOver;
    }

    public static void setGameOver(boolean status) {
        gameOver = status;
        if (status) {
            Board.resetBoard();
        }
    }
}
