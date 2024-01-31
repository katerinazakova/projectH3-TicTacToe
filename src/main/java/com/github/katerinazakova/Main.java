package com.github.katerinazakova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char currentPlayer = 'X';
        GameBoard.printEmptyGameBoard();

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter coordinates");
                int row = scanner.nextInt();
                int column = scanner.nextInt();

                if (("This cell was changed to " + currentPlayer).equals(GameCells.takeCell(row, column, currentPlayer))) {
                    GameBoard.printActualGameBoard();
                    if (GameAnalysis.isPlayerVictory(currentPlayer)) {
                        System.out.println("Status game: " + currentPlayer + " wins");
                        return;
                    } else if (GameAnalysis.isOccupiedAllCells()) {
                        System.out.println("Status game: draw");
                        return;
                    } else {
                        System.out.println("Game not finished");
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers 1-3!");
            }

        }

    }
}
