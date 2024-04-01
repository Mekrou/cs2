import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConnectFour {
    private char[][] board;
    private String currentTurn;
    private char nextToken;

    public String getCurrentTurn() {
        return currentTurn;
    }
    public char getNextToken() {
        return nextToken;
    }

    public ConnectFour() {
        board = new char[6][7];
        // All spaces to empty chars
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
        currentTurn = "Red";
        nextToken = 'R';
    }

    public void nextTurn() {
        if (currentTurn.equals("Red")) {
            currentTurn = "Yellow";
            nextToken = 'Y';
        } else {
            currentTurn = "Red";
            nextToken = 'R';
        }
    }

    public int nextAvailablePosition(int columnNum) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][columnNum] == '-') {
                return i;
            }
        }
        return -1;
    }

    public void dropPiece(int columnNum, char token) throws ColumnFull {
        int nextAvlPos = nextAvailablePosition(columnNum);
        if (nextAvlPos == -1)
            throw new ColumnFull("Column full!");
        board[nextAvlPos][columnNum] = token;
    }

    public String toString() {
        String to_return = "  0   1   2   3   4   5   6";
        for (int i = 0; i < 6; i++) {
            to_return += "\n-----------------------------\n";
            to_return += "| ";
            for (int j = 0; j < 7; j++) {
                to_return += board[i][j] + " | ";
            }
        }
        to_return += "\n-----------------------------\n";
        return to_return;
    }

    public void saveGame() {
        System.out.print("Enter a savename: ");
        try {
            Scanner keyboard = Driver.getKeyboard();
            String input = keyboard.next();

            File file = new File(input);
            PrintWriter writer = new PrintWriter(file);
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    writer.print(board[i][j] + ",");
                }
                writer.println();
            }
            writer.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void loadGame() {
        System.out.println("Enter a savename: ");
        try {
            Scanner keyboard = Driver.getKeyboard();
            String input = keyboard.next();

            File file = new File(input);
            Scanner fileReader = new Scanner(file);
            for (int i = 0; i < board.length; i++) {
                if (fileReader.hasNext())
                {
                    String nextLine = fileReader.nextLine();
                    String[] boardStrings = nextLine.split(",");
                    for (int j = 0; j < boardStrings.length; j++)
                    {
                        board[i][j] = boardStrings[j].charAt(0);
                    }
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("A savefile with that name could not be found.");
            loadGame();
        }
    }
}
