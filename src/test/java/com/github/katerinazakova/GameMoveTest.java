package com.github.katerinazakova;

import org.junit.jupiter.api.Test;

public class GameMoveTest {
    private final char[][] testGameBoard = new char[][]{
            {'_', '_', '_'},
            {'_', 'X', 'X'},
            {'_', 'X', 'O'}

    };


    @Test
    void testTakeCell_OccupiedCellOutput() {
        //arrange
        int row = 1;
        int column = 1;
        char currentPlayer = 'X';
        String expectedResult = "This cell is occupied! Choose another one!";
        //act
        String result = GameMove.takeCell(row, column, currentPlayer);

        //assert

    }


}
