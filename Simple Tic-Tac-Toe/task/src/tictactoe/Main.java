package tictactoe;

import java.util.Scanner;

public class Main {

    static char[][] gameBoard = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    static int j = 0;

    public static void main(String[] args) {

        printBoard(gameBoard);

        while (!findWinner()){
            analyzeMove(gameBoard);
        }
    }

    public static void analyzeMove(char[][] gameBoard) {

        boolean check = true;
        int row;
        int column;

        System.out.println("Enter coordinates");

        do {
            String userMove = scanner.nextLine();
            try {
                String [] coordinates = userMove.split(" ");
                row = Integer.parseInt(coordinates[0]);
                column = Integer.parseInt(coordinates[1]);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (row < 1 || row > 3 || column < 1 || column > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (gameBoard[row - 1][column - 1] == 'X'
                    || gameBoard[row - 1][column - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                if (j % 2 == 0) {
                    gameBoard[row - 1][column - 1] = 'X';
                    j++;
                } else {
                    gameBoard[row - 1][column - 1] = 'O';
                    j++;
                }
                check = false;
            }

        } while (check);

        printBoard(gameBoard);

    }

    public static void printBoard(char[][] gameBoard) {

        System.out.println("---------");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    public static boolean findWinner() {
        if (isImpossible(gameBoard)) {
            System.out.println("Impossible");
            return true;
        } else if (xWins(gameBoard)) {
            System.out.println("X wins");
            return true;
        } else if (oWins(gameBoard)) {
            System.out.println("O wins");
            return true;
        } else if (draw(gameBoard)) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }

    public static boolean xWins(char[][] gameBoard) {

        int xWins = 264;

        if (gameBoard[0][0] + gameBoard[0][1] + gameBoard[0][2] == xWins ||
                gameBoard[1][0] + gameBoard[1][1] + gameBoard[1][2] == xWins ||
                gameBoard[2][0] + gameBoard[2][1] + gameBoard[2][2] == xWins ||
                gameBoard[0][0] + gameBoard[1][0] + gameBoard[2][0] == xWins ||
                gameBoard[0][1] + gameBoard[1][1] + gameBoard[2][1] == xWins ||
                gameBoard[0][2] + gameBoard[1][2] + gameBoard[2][2] == xWins ||
                gameBoard[0][0] + gameBoard[1][1] + gameBoard[2][2] == xWins ||
                gameBoard[0][2] + gameBoard[1][1] + gameBoard[2][0] == xWins) {
            return true;
        }
        return false;
    }

    public static boolean oWins(char[][] gameBoard) {

        int oWins = 237;

        if (gameBoard[0][0] + gameBoard[0][1] + gameBoard[0][2] == oWins ||
                gameBoard[1][0] + gameBoard[1][1] + gameBoard[1][2] == oWins ||
                gameBoard[2][0] + gameBoard[2][1] + gameBoard[2][2] == oWins ||
                gameBoard[0][0] + gameBoard[1][0] + gameBoard[2][0] == oWins ||
                gameBoard[0][1] + gameBoard[1][1] + gameBoard[2][1] == oWins ||
                gameBoard[0][2] + gameBoard[1][2] + gameBoard[2][2] == oWins ||
                gameBoard[0][0] + gameBoard[1][1] + gameBoard[2][2] == oWins ||
                gameBoard[0][2] + gameBoard[1][1] + gameBoard[2][0] == oWins) {
            return true;
        }
        return false;
    }

    public static boolean draw(char[][] gameBoard) {

        int Xcount = 0;
        int Ocount = 0;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {

                if (gameBoard[i][j] == 'X') {
                    Xcount++;
                }

                if (gameBoard[i][j] == 'O') {
                    Ocount++;
                }
            }
        }

        return Xcount + Ocount == 9;
    }

    public static boolean isImpossible(char[][] gameBoard) {

        int Xcount = 0;
        int Ocount = 0;

        if ((xWins(gameBoard) && oWins(gameBoard)) && !draw(gameBoard)) {
            return true;
        }

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == 'X') {
                    Xcount++;
                } else if (gameBoard[i][j] == 'O'){
                    Ocount++;
                }
            }
        }

        return Math.abs(Xcount - Ocount) > 1;
    }


}

