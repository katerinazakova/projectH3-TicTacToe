package com.github.katerinazakova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.katerinazakova.GameBoard.GAME_BOARD;

public class GameMoveTest {

    @Test
    void testTakeCell_OccupiedCell() {
        //arrange
        int row = 1;
        int column = 1;
        char currentPlayer = 'X';
        GameBoard.GAME_BOARD[0][0] = 'X';
        String expectedResult = "This cell is occupied! Choose another one!";
        //act
        String result = GameMove.takeCell(row, column, currentPlayer);

        //assert
        assertEquals(expectedResult, result);

    }

    @Test
    void testTakeCell_BookingEmptyCell() {
        //arrange
        int row = 1;
        int column = 1;
        char currentPlayer = 'O';
        GameBoard.GAME_BOARD[0][0] = '_';
        String expectedResult = "This cell was changed to " + currentPlayer;
        //act
        String result = GameMove.takeCell(row, column, currentPlayer);
        //assert
        assertEquals(expectedResult, result);
    }


}
