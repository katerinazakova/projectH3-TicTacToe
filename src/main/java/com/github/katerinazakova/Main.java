package com.github.katerinazakova;

import java.util.Scanner;

import static com.github.katerinazakova.GameBoard.makeEmptyGameBoard;
import static com.github.katerinazakova.GameBoard.printGameBoard;
import static com.github.katerinazakova.Player.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfRows = 3;
        int numberOfColumns = 5;
        char[][] ticTacToeArray = new char[numberOfRows][numberOfColumns];
        makeEmptyGameBoard(ticTacToeArray, numberOfRows, numberOfColumns);
        char currentPlayer = 'X';

        while (true) {
            System.out.println("Enter coordinates:");
            String coordinateNumberOne = scanner.next();
            String coordinateNumberTwo = scanner.next();

            try {
                int firstCoordinate = Integer.parseInt(coordinateNumberOne);
                int secondCoordinate = Integer.parseInt(coordinateNumberTwo);

                if (firstCoordinate < 1 || firstCoordinate > 3 || secondCoordinate < 1 || secondCoordinate > 3) {
                    System.out.println("Print coordinates should be from 1 to 3!");
                } else {
                    String result;
                    if (currentPlayer == 'X') {
                        result = controlPlaceForPlayerX(ticTacToeArray, firstCoordinate, secondCoordinate);
                    } else {
                        result = controlPlaceForPlayerO(ticTacToeArray, firstCoordinate, secondCoordinate);
                    }

                    if (result.equals("This cell was changed to " + currentPlayer)) {
                        printGameBoard(ticTacToeArray);
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
            String xWins = controlToPlayerX(ticTacToeArray);
            String oWins = controlToPlayerO(ticTacToeArray);
            String emptyPlace = controlToEmptyPlace(ticTacToeArray);
            String numberXAndO = controlToNumberXAndNumberO(ticTacToeArray);
            if (xWins.equals("X wins") && oWins.equals("O wins")
                    || numberXAndO.equals("Impossible")) {
                System.out.println("Impossible");
            } else if (xWins.equals("X wins")) {
                System.out.println(xWins);
                return;
            } else if (oWins.equals("O wins")) {
                System.out.println(oWins);
                return;
            } else if (emptyPlace.equals("Empty place exist")) {
                System.out.println("Game not finished");
            } else {
                System.out.println("Draw");
                return;
            }
        }
    }


}