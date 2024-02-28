
public class Move {
    public static boolean isValidMove(int move) {
        if (move < 1 || move > 9) {
            System.out.println("Invalid move. Please choose a number between 1 and 9.");
            return false;
        } else if (Board.getCell(move) == 'X' || Board.getCell(move) == 'O') {
            System.out.println("Invalid move. That cell is already taken.");
            return false;
        } else {
            return true;
        }
    }

    public static void makeMove(int move, char symbol) {
        Board.setCell(move, symbol);
    }
}
