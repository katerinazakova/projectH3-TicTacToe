package com.github.katerinazakova;

public class GameBoard {
    protected static final char[][] GAME_BOARD = new char[3][3];

    public static void printEmptyGameBoard() {
        printLine(9);
        for (int i = 0; i < GAME_BOARD.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < GAME_BOARD[0].length; j++) {
                GAME_BOARD[i][j] = '_';
                System.out.print(GAME_BOARD[i][j] + " ");
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
        for (int i = 0; i < GAME_BOARD.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < GAME_BOARD[0].length; j++) {
                System.out.print(GAME_BOARD[i][j] + " ");
            }
            System.out.println("|");
        }
        printLine(9);
    }

}
