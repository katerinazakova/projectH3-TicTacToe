package com.github.katerinazakova;

public class Player {


    public static String controlPlaceForPlayerX(char[][] ticTacGameArray, int numberOne, int numberTwo) {
        if (ticTacGameArray[numberTwo - 1][numberOne] == '_') {
            ticTacGameArray[numberTwo - 1][numberOne] = 'X';
            return "This cell was changed to X";
        } else {
            return "This cell is occupied! Choose another one!";
        }
    }

    public static String controlPlaceForPlayerO(char[][] ticTacGameArray, int numberOne, int numberTwo) {
        if (ticTacGameArray[numberTwo - 1][numberOne] == '_') {
            ticTacGameArray[numberTwo - 1][numberOne] = 'O';
            return "This cell was changed to O";
        } else {
            return "This cell is occupied! Choose another one!";
        }
    }

    public static void analyseTheGame(char[][] ticTacGameArray) {
        String xWins = controlToPlayerX(ticTacGameArray);
        String oWins = controlToPlayerO(ticTacGameArray);
        String emptyPlace = controlToEmptyPlace(ticTacGameArray);
        String numberXAndO = controlToNumberXAndNumberO(ticTacGameArray);
        if (xWins.equals("X wins") && oWins.equals("O wins")
                || numberXAndO.equals("Impossible")) {
            System.out.println("Impossible");
        } else if (xWins.equals("X wins")) {
            System.out.println(xWins);
        } else if (oWins.equals("O wins")) {
            System.out.println(oWins);
        } else if (emptyPlace.equals("Empty place exist")) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }

    public static String controlToPlayerX(char[][] ticTacGameArray) {
        char playerX = 'X';
        int numberOfWin = 3;

        for (int i = 0; i < ticTacGameArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[i][j] == playerX) {
                    counter++;
                    if (counter == numberOfWin) {
                        return "X wins";
                    }
                } else {
                    counter = 0;
                }
            }
        }

        for (int j = 0; j < ticTacGameArray[0].length; j++) {
            int counter = 0;
            for (int i = 0; i < ticTacGameArray.length; i++) {
                if (ticTacGameArray[i][j] == playerX) {
                    counter++;
                    if (counter == numberOfWin) {
                        return "X wins";
                    }
                } else {
                    counter = 0;
                }
            }
        }

        for (int i = 0; i < ticTacGameArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[0][1] == playerX && ticTacGameArray[1][2] == playerX
                        && ticTacGameArray[2][3] == playerX) {
                    counter++;
                    if (counter == numberOfWin) {
                        return "X wins";
                    }
                } else if (ticTacGameArray[0][3] == playerX && ticTacGameArray[1][2] == playerX
                        && ticTacGameArray[2][1] == playerX) {
                    counter++;
                    if (counter == numberOfWin) {
                        return "X wins";
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return "X does not win";
    }

    public static String controlToPlayerO(char[][] ticTacGameArray) {
        char playerO = 'O';
        int numberOfWin = 3;

        for (int i = 0; i < ticTacGameArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[i][j] == playerO) {
                    counter++;
                    if (counter == numberOfWin) {
                        return "O wins";
                    }
                } else {
                    counter = 0;
                }
            }
        }

        for (int j = 0; j < ticTacGameArray[0].length; j++) {
            int counter = 0;
            for (int i = 0; i < ticTacGameArray.length; i++) {
                if (ticTacGameArray[i][j] == playerO) {
                    counter++;
                    if (counter == numberOfWin) {
                        return "O wins";
                    }
                } else {
                    counter = 0;
                }
            }
        }

        for (int i = 0; i < ticTacGameArray.length; i++) {
            int count = 0;
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[0][1] == playerO && ticTacGameArray[1][2] == playerO
                        && ticTacGameArray[2][3] == playerO) {
                    count++;
                    if (count == numberOfWin) {
                        return "O wins";
                    }
                } else if (ticTacGameArray[0][3] == playerO && ticTacGameArray[1][2] == playerO
                        && ticTacGameArray[2][1] == playerO) {
                    count++;
                    if (count == numberOfWin) {
                        return "O wins";
                    }
                } else {
                    count = 0;
                }
            }
        }
        return "O does not win";
    }

    public static String controlToEmptyPlace(char[][] ticTacGameArray) {
        for (int i = 0; i < ticTacGameArray.length; i++) {
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[i][j] == '_') {
                    return "Empty place exist";
                }
            }
        }
        return "Empty place does not exist";
    }

    public static String controlToNumberXAndNumberO(char[][] ticTacGameArray) {
        int counterOfX = 0;
        int counterOfO = 0;
        for (int i = 0; i < ticTacGameArray.length; i++) {
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[i][j] == 'X') {
                    counterOfX++;
                }
            }
        }

        for (int i = 0; i < ticTacGameArray.length; i++) {
            for (int j = 0; j < ticTacGameArray[0].length; j++) {
                if (ticTacGameArray[i][j] == 'O') {
                    counterOfO++;
                }
            }
        }
        int differenceX = counterOfX - counterOfO;
        int differenceO = counterOfO - counterOfX;

        if (differenceX > 1 || differenceO > 1) {
            return "Impossible";
        }
        return "It is not impossible";
    }
}
