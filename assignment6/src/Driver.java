import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    private static Scanner keyboard;

    static {
        keyboard = new Scanner(System.in);
    }

    public static Scanner getKeyboard() {
        return keyboard;
    }

    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        int input = 0;

        while (input != 9) {
            try {
                System.out.println(game);
                System.out.println("Which column would " + game.getCurrentTurn() + " like to go in?"
                        + " (7 to save, 8 to load, 9 to quit)");
                input = keyboard.nextInt();

                if (input >= 0 && input <= 6) {
                    game.dropPiece(input, game.getNextToken());
                    game.nextTurn();
                } else if (input == 7) {
                    game.saveGame();
                } else if (input == 8) {
                    game.loadGame();
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
            } catch (ColumnFull e) {
                System.out.println(e.getMessage());
            }
        }

        keyboard.close();
    }
}
