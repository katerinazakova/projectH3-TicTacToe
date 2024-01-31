package com.github.katerinazakova;

public class Main {
    public static void main(String[] args) {
        char currentPlayer = 'X';
        GameBoard.printEmptyGameBoard();

        while (true) {
            GameMove.controlOfPlayerMoves(currentPlayer);

            if (GameAnalysis.isPlayerWinner(currentPlayer)) {
                System.out.println("Status game: " + currentPlayer + " wins");
                return;
            } else if (GameAnalysis.isOccupiedAllCells()) {
                System.out.println("Status game: draw");
                return;
            } else {
                System.out.println("Game not finished");
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

}
