package src;

public class Resolver extends Board {

    public Resolver(char[][] board) {
        super(board);
    }

    //checking the board
    public static boolean checkingBoard(char[][] board) {
        //checking the first player
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }
        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            System.out.println("FIRST PLAYER WON !!!");
            return true;
        }

        //checking the second player
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            System.out.println("SECOND PLAYER WON !!!");
            return true;
        }
        return false;
    }


}
