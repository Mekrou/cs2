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
        
    }
}
