package com.github.katerinazakova;

public class Win {

    private static final int WINNER_PLACES = 3;

    public static String controlOfPlayerVictory(char[][] ticTacGameArray, char currentPlayer) {
        if (isRowWins(ticTacGameArray,currentPlayer) || isColumnWins(ticTacGameArray, currentPlayer)
                || (isDiagonalStartingInLeftCornerWins(ticTacGameArray,currentPlayer)) || (isDiagonalStartingInRightCornerWins(ticTacGameArray, currentPlayer))){
            return currentPlayer + " wins";
        }
        return currentPlayer + " does not wins";
    }
    public static boolean isRowWins(char[][] ticTacGameArray, char currentPlayer) {
        for (char[] chars : ticTacGameArray) {
            int numberOfMoves = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (chars[j] == currentPlayer) {
                    numberOfMoves++;
                    if (numberOfMoves == WINNER_PLACES) {
                        return true;
                    }
                } else {
                    numberOfMoves = 0;
                }
            }
        }
        return false;
    }
    
    public static boolean isColumnWins(char[][] ticTacGameArray, char currentPlayer) {
        int counter = 0;
        for (int j = 0; j < ticTacGameArray[0].length; j++) {

            for (int i = 0; i < ticTacGameArray.length; i++) {
                if (ticTacGameArray[i][j] == currentPlayer) {
                    counter++;
                    if (counter == WINNER_PLACES) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public static boolean isDiagonalStartingInLeftCornerWins(char[][] ticTacGameArray, char currentPlayer) {
        for (int i = 0; i < ticTacGameArray.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[0][1] == currentPlayer && ticTacGameArray[1][2] == currentPlayer
                        && ticTacGameArray[2][3] == currentPlayer) {
                    numberOfMoves++;
                    if (numberOfMoves == WINNER_PLACES) {
                        return true;
                    }
                } else {
                    numberOfMoves = 0;
                }
            }
        }
        return false;
    }

    public static boolean isDiagonalStartingInRightCornerWins(char[][] ticTacGameArray, char currentPlayer) {
        for (int i = 0; i < ticTacGameArray.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[0][3] == currentPlayer && ticTacGameArray[1][2] == currentPlayer
                        && ticTacGameArray[2][1] == currentPlayer) {
                    numberOfMoves++;
                    if (numberOfMoves == WINNER_PLACES) {
                        return true;
                    }
                } else {
                    numberOfMoves = 0;
                }
            }
        }
        return false;
    }


}
