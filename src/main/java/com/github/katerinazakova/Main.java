package com.github.katerinazakova;

import java.util.Scanner;

import static com.github.katerinazakova.GameBoard.printEmptyGameBoard;

public class Main {
    public static void main(String[] args) {
        int numberOfRows = 3;
        int numberOfColumns = 5;
        char[][] ticTacToeArray = new char[numberOfRows][numberOfColumns];
        printEmptyGameBoard(ticTacToeArray, numberOfRows, numberOfColumns);
        char currentPlayer = 'X';

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter coordinates");
                int column = scanner.nextInt();
                int row = scanner.nextInt();

                if (isNotValidCoordinates(row, column)) {
                    System.out.println("Print coordinates should be from 1 to 3!");

                } else {
                    GameCells.takeCell(ticTacToeArray, row, column, currentPlayer);
                    GameBoard.printGameBoard(ticTacToeArray);
                    if (Win.isPlayerVictory(ticTacToeArray, currentPlayer)) {
                        System.out.println("Status game: " + currentPlayer + " wins");
                        return;
                    } else if (GameCells.isOccupiedAllCells(ticTacToeArray)) {
                        System.out.println("Status game: draw");
                        return;
                    }
                    System.out.println("Game not finished");
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }

            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }

        }

    }

    public static boolean isNotValidCoordinates(int row, int column) {
        return (row < 1 || row > 3 || column < 1 || column > 3);

    }

}
