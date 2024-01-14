package com.github.katerinazakova;

public class GameBoard {
    private static final int NUMBER_OF_ROW = 3;
    private static final int NUMBER_OF_COLUMN = 5;
    protected static final char[][] TIC_TAC_TOE_GAME_ARRAY = new char[NUMBER_OF_ROW][NUMBER_OF_COLUMN];

    public static void printGameBoard() {
        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();

        for (int i = 0; i < TIC_TAC_TOE_GAME_ARRAY.length; i++) {
            for (int j = 0; j < TIC_TAC_TOE_GAME_ARRAY[0].length; j++) {
                System.out.print(TIC_TAC_TOE_GAME_ARRAY[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();
    }


    public static void printEmptyGameBoard() {
        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();

        for (int i = 0; i < NUMBER_OF_ROW; i++) {
            for (int j = 0; j < NUMBER_OF_COLUMN; j++) {
                if (j == 0 || j == NUMBER_OF_COLUMN - 1) {
                    TIC_TAC_TOE_GAME_ARRAY[i][j] = '|';
                } else {
                    TIC_TAC_TOE_GAME_ARRAY[i][j] = '_';
                }
                System.out.print(TIC_TAC_TOE_GAME_ARRAY[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

}
