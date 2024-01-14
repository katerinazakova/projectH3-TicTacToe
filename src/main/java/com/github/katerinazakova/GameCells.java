package com.github.katerinazakova;

import static com.github.katerinazakova.GameBoard.TIC_TAC_TOE_GAME_ARRAY;

public class GameCells {

    public static void takeCell(int numberOne, int numberTwo, char currentPlayer) {
        if (TIC_TAC_TOE_GAME_ARRAY[numberTwo - 1][numberOne] == '_') {
            TIC_TAC_TOE_GAME_ARRAY[numberTwo - 1][numberOne] = currentPlayer;
            System.out.println("This cell was changed to " + currentPlayer);
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }

    public static boolean isOccupiedAllCells() {
        for (char[] chars : TIC_TAC_TOE_GAME_ARRAY) {
            for (int j = 0; j < TIC_TAC_TOE_GAME_ARRAY[0].length; j++) {
                if (chars[j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}
