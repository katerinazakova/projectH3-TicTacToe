package com.github.katerinazakova;

import static com.github.katerinazakova.GameBoard.TIC_TAC_TOE_GAME_ARRAY;

public class Win {

    private static final int WINNER_PLACES = 3;

    public static boolean isPlayerVictory(char currentPlayer) {
        return isRowWins(currentPlayer) || isColumnWins(currentPlayer)
                || (isDiagonalStartingInLeftCornerWins(currentPlayer)) || (isDiagonalStartingInRightCornerWins(currentPlayer));

    }

    public static boolean isRowWins(char currentPlayer) {
        for (char[] chars : TIC_TAC_TOE_GAME_ARRAY) {
            int numberOfMoves = 0;
            for (int j = 0; j < TIC_TAC_TOE_GAME_ARRAY[0].length; j++) {
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

    public static boolean isColumnWins(char currentPlayer) {
        int counter = 0;
        for (int j = 0; j < TIC_TAC_TOE_GAME_ARRAY[0].length; j++) {

            for (int i = 0; i < TIC_TAC_TOE_GAME_ARRAY.length; i++) {
                if (TIC_TAC_TOE_GAME_ARRAY[i][j] == currentPlayer) {
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

    public static boolean isDiagonalStartingInLeftCornerWins(char currentPlayer) {
        for (int i = 0; i < TIC_TAC_TOE_GAME_ARRAY.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < TIC_TAC_TOE_GAME_ARRAY[0].length; j++) {
                if (TIC_TAC_TOE_GAME_ARRAY[0][1] == currentPlayer && TIC_TAC_TOE_GAME_ARRAY[1][2] == currentPlayer
                        && TIC_TAC_TOE_GAME_ARRAY[2][3] == currentPlayer) {
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

    public static boolean isDiagonalStartingInRightCornerWins(char currentPlayer) {
        for (int i = 0; i < TIC_TAC_TOE_GAME_ARRAY.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < TIC_TAC_TOE_GAME_ARRAY[0].length; j++) {
                if (TIC_TAC_TOE_GAME_ARRAY[0][3] == currentPlayer && TIC_TAC_TOE_GAME_ARRAY[1][2] == currentPlayer
                        && TIC_TAC_TOE_GAME_ARRAY[2][1] == currentPlayer) {
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
