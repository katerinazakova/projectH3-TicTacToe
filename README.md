# Tic-Tac-Toe game
Tic-tac-toe is played by two players on a 3x3 grid. One of the players is 'X', and the other player is 'O'. X plays first, then O takes the next turn, and so on. The players write 'X' and 'O' on a 3x3 field.
The first player that puts 3 X's or 3 O's in a straight line (including diagonals) wins the game.
## 1. stage
Your first task is to print the game grid in the console output. You print three lines, each containing three characters (X’s and O’s)
to represent a game of tic-tac-toe where all fields of the grid have been filled in.
## 2. stage
In this stage, you will write a program that:
Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid. The grid can contain only X, O and _ symbols.
Outputs a line of dashes --------- above and below the grid, adds a pipe | symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.

## 3. stage
Take a string entered by the user and print the game grid as in the previous stage. Analyze the game state and print the result. 

Possible states:

Game not finished when neither side has three in a row but the grid still has empty cells.

Draw when no side has a three in a row and the grid has no empty cells.

X wins when the grid has three X’s in a row (including diagonals).

O wins when the grid has three O’s in a row (including diagonals).

Impossible when the grid has three X’s in a row as well as three O’s in a row, or there are a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 or more, then the game state is impossible).

In this stage, we will assume that either X or O can start the game.
## 4. stage
The program should work as follows:

Get the initial 3x3 grid from the input as in the previous stages. Here the user should input 9 symbols representing the field, for example, _XXOO_OX_.
Output this 3x3 grid as in the previous stages.
Prompt the user to make a move. The user should input 2 coordinate numbers that represent the cell where they want to place their X, for example, 1 1.


Analyze user input. If the input is incorrect, inform the user why their input is wrong:

Print "This cell is occupied! Choose another one!" if the cell is not empty.

Print "You should enter numbers!" if the user enters non-numeric symbols in the coordinates input.

Print "Coordinates should be from 1 to 3!" if the user enters coordinates outside the game grid.

Keep prompting the user to enter the coordinates until the user input is valid.
If the input is correct, update the grid to include the user's move and print the updated grid to the console.

To summarize, you need to output the field 2 times: once before the user's move (based on the first line of input) and once after the user has entered valid coordinates (then you need to update the grid to include that move).
## 5. stage
In this stage, you should write a program that:

Prints an empty grid at the beginning of the game.

Creates a game loop where the program asks the user to enter the cell coordinates, analyzes the move for correctness and shows a grid with the changes if everything is okay.

Ends the game when someone wins or there is a draw.

You need to output the final result at the end of the game.

Project from Hyperskill: https://hyperskill.org/
