package com.github.katerinazakova;

public class GameBoard {

    public static void printGameBoard(char[][] ticTacGameArray) {
        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();
        for (int i = 0; i < ticTacGameArray.length; i++) {
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                System.out.print(ticTacGameArray[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();
    }


    public static void makeEmptyGameBoard(char[][] ticTacGameArray, int numberOfRows, int numberOfColumns) {
        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (j == 0 || j == numberOfColumns - 1) {
                    ticTacGameArray[i][j] = '|';
                } else {
                    ticTacGameArray[i][j] = '_';
                }
                System.out.print(ticTacGameArray[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 9; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

}
