package com.github.katerinazakova;

public class Main {
    public static void main(String[] args) {
        GameBoard.printEmptyGameBoard();
        GameStart gameStart = new GameStart();
        gameStart.startGame('X');
    }
}
