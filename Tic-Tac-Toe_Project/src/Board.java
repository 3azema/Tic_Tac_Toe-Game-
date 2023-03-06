package src;

public class Board {
    //declaring the board
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public Board(char[][] board) {
        Board.board = board;
    }

    //printing the board
    public static void printingBoard(char[][] board){
        System.out.println("    1    2    3");
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("| " + board[row][col] + " |");
            }
            System.out.println();
        }
    }

}
