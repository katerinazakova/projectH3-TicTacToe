package com.github.katerinazakova;

public class GameCells {

    public static void takeCell(char[][] ticTacGameArray, int numberOne, int numberTwo, char currentPlayer) {
        if (ticTacGameArray[numberTwo - 1][numberOne] == '_') {
            ticTacGameArray[numberTwo - 1][numberOne] = currentPlayer;
            System.out.println("This cell was changed to " + currentPlayer);
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }

    public static boolean isOccupiedAllCells(char[][] ticTacGameArray) {
        for (char[] chars : ticTacGameArray) {
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (chars[j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}
