package com.github.katerinazakova;

import java.util.Scanner;

import static com.github.katerinazakova.GameBoard.GAME_BOARD;

public class GameCells {
    public static void controlOfPlayerMoves(char currentPlayer) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter coordinates");
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            String statusOfCell = takeCell(row, column, currentPlayer);

            if (("This cell was changed to " + currentPlayer).equals(statusOfCell)) {
                GameBoard.printActualGameBoard();
            } else {
                System.out.println("This cell is occupied! Choose another one!");
                controlOfPlayerMoves(currentPlayer);
            }

        } catch (RuntimeException e) {
            System.out.println("Enter numbers 1 - 3!");
        }
    }

    public static String takeCell(int row, int column, char currentPlayer) {
        if (GAME_BOARD[row - 1][column - 1] == '_') {
            GAME_BOARD[row - 1][column - 1] = currentPlayer;
            return "This cell was changed to " + currentPlayer;
        } else {
            return "This cell is occupied! Choose another one!";
        }
    }

}
