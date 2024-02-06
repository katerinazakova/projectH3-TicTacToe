package com.github.katerinazakova;

public class GameBoard {
    static final char[][] GAME_BOARD = new char[3][3];

    public static void printEmptyGameBoard() {
        printLine(9);
        for (int row = 0; row < GAME_BOARD.length; row++){
            System.out.print("| ");
            for (int column = 0; column < GAME_BOARD[0].length; column++){
                GAME_BOARD [row][column] = '_';
                System.out.print(GAME_BOARD [row][column] + " ");
            }
            System.out.println("|");
        }
        printLine(9);

    }

    public static void printLine(int lengthLine) {
        for (int i = 0; i < lengthLine; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public static void printActualGameBoard() {
        printLine(9);
        for (int row = 0; row < GAME_BOARD.length; row++) {
            System.out.print("| ");
            for (int column = 0; column < GAME_BOARD[0].length; column++) {
                System.out.print(GAME_BOARD[row][column] + " ");
            }
            System.out.println("|");
        }
        printLine(9);
    }

}
