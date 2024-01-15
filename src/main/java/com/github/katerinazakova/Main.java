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
                int column = scanner.nextInt();
                int row = scanner.nextInt();

                if (AnalyseGame.isNotValidCoordinates(row, column)) {
                    System.out.println("Print coordinates should be from 1 to 3!");

                } else {
                    GameCells.takeCell(row, column, currentPlayer);
                    GameBoard.printGameBoard();
                    if (Win.isPlayerVictory(currentPlayer)) {
                        System.out.println("Status game: " + currentPlayer + " wins");
                        return;
                    } else if (GameCells.isOccupiedAllCells()) {
                        System.out.println("Status game: draw");
                        return;
                    }
                    System.out.println("Game not finished");
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }

        }

    }
}
