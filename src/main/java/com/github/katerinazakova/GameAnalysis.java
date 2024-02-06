package com.github.katerinazakova;

import static com.github.katerinazakova.GameBoard.GAME_BOARD;

public class GameAnalysis {

    public static boolean isPlayerWinner(char currentPlayer) {
        return isWinningRow(currentPlayer) || isWinningColumn(currentPlayer)
                || (isDiagonalStartingInLeftUpperCornerWins(currentPlayer)) || (isDiagonalStartingInRightUpperCornerWins(currentPlayer));

    }

    public static boolean isWinningRow(char currentPlayer) {
        for (char[] chars : GAME_BOARD) {
            if (chars[0] == currentPlayer && chars[1] == currentPlayer
                    && chars[2] == currentPlayer) {
                return true;

            }
        }
        return false;
    }

    public static boolean isWinningColumn(char currentPlayer) {
        for (int column = 0; column < GAME_BOARD[0].length; column++) {
            if (GAME_BOARD[0][column] == currentPlayer && GAME_BOARD[1][column] == currentPlayer
                    && GAME_BOARD[2][column] == currentPlayer) {
                return true;

            }
        }
        return false;
    }

    public static boolean isDiagonalStartingInLeftUpperCornerWins(char currentPlayer) {
        return (GAME_BOARD[0][0] == currentPlayer && GAME_BOARD[1][1] == currentPlayer
                && GAME_BOARD[2][2] == currentPlayer);

    }

    public static boolean isDiagonalStartingInRightUpperCornerWins(char currentPlayer) {
        return (GAME_BOARD[0][2] == currentPlayer && GAME_BOARD[1][1] == currentPlayer
                && GAME_BOARD[2][0] == currentPlayer);

    }

    public static boolean isOccupiedAllCells() {
        for (char[] chars : GAME_BOARD) {
            for (int column = 0; column < GAME_BOARD[0].length; column++) {
                if (chars[column] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}
