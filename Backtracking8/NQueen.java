package JavaWithDSA.Backtracking8;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

    public boolean isSafe(int row, int col, char[][] board) {

        // check horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // check vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Lower Right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    //Save Board
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }


    //Recursive Function

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        // After all Queen set
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        // to place Queen
        for (int row = 0; row < board.length; row++) {
            // to check if queen safe
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                // for next column
                helper(board, allBoards, col + 1);
                // if Q is not placed correctly
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens() {
        List<List<String>> allBoards = new ArrayList<>();

        // 2D Board Array
        char[][] board = new char[4][4];

        helper(board, allBoards, 0);

        return allBoards;

    }

    public static void main(String[] args) {

    }

}
