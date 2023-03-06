package src;

import java.util.InputMismatchException;
import java.util.Scanner;

import static src.Resolver.checkingBoard;

public class Game extends Board{
    public Game(char[][] board) {
        super(board);
    }

    public static void main(String[] args) {
        int exit = 0, second_restart, draw = 1;
        String first_player, second_player;
        Scanner scanner = new Scanner(System.in);
        Board board1 = new Game(board);

        //prompt messages
        System.out.println("Welcome to my Tic Tak Toe");
        System.out.println("First player [ X ] enter your name, Please: ");
        first_player = scanner.nextLine();
        System.out.println("second player [ O ] enter your name, Please: ");
        second_player = scanner.nextLine();


        //printing the empty board to start a game
        printingBoard(board);

        //getting the X from first player
        do {
            int row=0, col=0;

            //checking if the user haven't put an integer
            try {
                System.out.printf("%s enter the row number: ", first_player);
                row = scanner.nextInt();
                System.out.printf("%s enter the column number: ", first_player);
                col = scanner.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("REAAAAALLY!!! Is this a number!! GOODBYE PLAYBOY !!! ");
                break;
            }

            //checking if there is already a character in this place and insert the X
            //and checking if the user have put a number bigger than 3
            try {
                if (board[row - 1][col - 1] == ' '){
                    board[row - 1][col - 1] = 'X';
                    printingBoard(board);
                }
                else{
                    System.out.println("this place isn't empty :(");
                    continue;
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Please enter a number mn 1 to 3 ya ro7 omk !!");
                continue;
            }

            //checking the winner
            if(checkingBoard(board)) {
                exit = -1;
                continue;
            }

            //checking if the game is draw and start new one with clear board
            if (draw == 5)
            {
                System.out.println("Ta3adoool !! ");
                clearingBoard(board);
                printingBoard(board);
                continue;
            }


            //getting the O from first player
            do {
                second_restart = 0;
                int row2 = 0, col2 = 0;

                //and checking if the user haven't put an integer
                try {
                    System.out.printf("%s enter the row number: ", second_player);
                    row2 = scanner.nextInt();
                    System.out.printf("%s enter the column number: ", second_player);
                    col2 = scanner.nextInt();
                }catch (InputMismatchException ex){
                    System.out.println("REAAAAALLY!!! Is this a number!! GOODBYE PLAYBOY !!! ");
                    break;
                }


                //checking if there is already a character in this place and insert the O
                //and checking if the user have put a number bigger than 3
                try {
                    if (board[row2 - 1][col2 - 1] == ' '){
                        board[row2 - 1][col2 - 1] = 'O';
                        printingBoard(board);
                    }
                    else{
                        System.out.println("This place isn't empty :( ");
                        second_restart = 1;
                    }
                }catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("Please enter a number mn 1 to 3 ya ro7 omk !!");
                    continue;
                }

                //checking the winner
                if(checkingBoard(board)) {
                    exit = -1;
                }

            }while (second_restart == 1);

            draw++;

        }while (exit != -1);
    }
}