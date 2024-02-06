package com.github.katerinazakova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.github.katerinazakova.GameBoard.GAME_BOARD;

public class GameAnalysisTest {

    @Test
    void givenPlayerXWinsInRow_whenIsWinningRow_thenReturnTrue() {
        //arrange

        GameBoard.GAME_BOARD[0] = new char[]{'O', 'O', '_'};
        GameBoard.GAME_BOARD[1] = new char[]{'X', 'O', 'O'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'X', 'X'};
        char currentPlayerX = 'X';
        //act
        boolean resultTrue = GameAnalysis.isWinningRow(currentPlayerX);

        //assert
        assertTrue(resultTrue);
    }

    @Test
    void givenPlayerXNotWinsInRow_whenIsWinningRow_thenReturnFalse() {
        //arrange
        GameBoard.GAME_BOARD[0] = new char[]{'O', 'O', 'X'};
        GameBoard.GAME_BOARD[1] = new char[]{'X', 'O', 'X'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'O', 'X'};
        char currentPlayer = 'X';

        //act
        boolean result = GameAnalysis.isWinningRow(currentPlayer);
        //assert
        assertFalse(result);
    }


    @Test
    void givenPlayerOWinsInColumn_whenIsWinningColumn_thenReturnTrue() {
        //arrange
        GameBoard.GAME_BOARD[0] = new char[]{'O', 'O', '_'};
        GameBoard.GAME_BOARD[1] = new char[]{'X', 'O', 'X'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'O', 'X'};
        char currentPlayer = 'O';
        //act
        boolean result = GameAnalysis.isWinningColumn(currentPlayer);
        //assert
        assertTrue(result);
    }

    @Test
    void givenPlayerONotWinsInColumn_whenIsWinningColumn_thenReturnFalse() {
        //arrange
        GameBoard.GAME_BOARD[0] = new char[]{'O', 'X', 'O'};
        GameBoard.GAME_BOARD[1] = new char[]{'X', 'O', 'X'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'O', 'X'};
        char currentPlayer = 'O';
        //act
        boolean result = GameAnalysis.isWinningColumn(currentPlayer);
        //assert
        assertFalse(result);
    }


    @Test
    void givenPlayerXWinsInDiagonal_whenIsDiagonalStartingInRightUpperCornerWins_thenReturnTrue() {
        //arrange
        GameBoard.GAME_BOARD[0] = new char[]{'O', 'X', 'X'};
        GameBoard.GAME_BOARD[1] = new char[]{'O', 'X', 'O'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'O', 'X'};
        char currentPlayer = 'X';
        //act
        boolean result = GameAnalysis.isDiagonalStartingInRightUpperCornerWins(currentPlayer);
        //assert
        assertTrue(result);
    }

    @Test
    void givenPlayerXNotWinsInDiagonal_whenIsDiagonalStartingInRightUpperCornerWins_thenReturnFalse() {
        //arrange
        GameBoard.GAME_BOARD[0] = new char[]{'O', 'X', 'O'};
        GameBoard.GAME_BOARD[1] = new char[]{'X', 'O', 'X'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'O', 'X'};
        char currentPlayer = 'X';
        //act
        boolean result = GameAnalysis.isDiagonalStartingInRightUpperCornerWins(currentPlayer);
        //assert
        assertFalse(result);
    }

    @Test
    void givenAllGameBoardIsOccupied_whenIsOccupiedAllCells_thenReturnTrue() {

        GameBoard.GAME_BOARD[0] = new char[]{'O', 'X', 'O'};
        GameBoard.GAME_BOARD[1] = new char[]{'X', 'O', 'X'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', 'O', 'X'};

        //act
        boolean result = GameAnalysis.isOccupiedAllCells();
        //assert
        assertTrue(result);

    }

    @Test
    void givenAllGameBoardIsNotOccupied_whenIsOccupiedAllCells_thenReturnFalse() {
        GameBoard.GAME_BOARD[0] = new char[]{'O', 'X', 'O'};
        GameBoard.GAME_BOARD[1] = new char[]{'_', 'O', '_'};
        GameBoard.GAME_BOARD[2] = new char[]{'X', '_', 'X'};

        //act
        boolean result = GameAnalysis.isOccupiedAllCells();
        //assert
        assertFalse(result);

    }


}
