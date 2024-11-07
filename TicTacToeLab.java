package week06lab;

import java.util.Scanner;

public class TicTacToeLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GameBoard gameBoard= new GameBoard();
gameBoard.initialize();
gameBoard.display();

String winner = "";
String player = "X";
int allSquares = 1;
int squareNumber;

Scanner in = new Scanner(System.in);

System.out.println("     ------------------");
System.out.println("   Welcome to tic-tac-toe!");
System.out.println("       First Turn: " + player);
System.out.println("     ------------------");

while (winner.equals("") && allSquares>0 && allSquares <=9) {
	System.out.println(player + "'s turn -- enter a number designating the square to place an " + player + " in:" );
	String readInput = in.nextLine();
	squareNumber = Integer.valueOf(readInput);
	
	if (squareNumber > 0 && squareNumber<=9) {
		if(gameBoard.ifValidSetSquare(squareNumber, readInput, player)) {
			if (player.equals("X")) {
				player = "O";
			} else {
				player = "X";
			} allSquares ++;
			gameBoard.display();
		winner = gameBoard.checkWinStatus(); {
			for (int pos = 0; pos <8; pos++) {
				String winningCombo = "";
			}
		}
		
	}else {
		System.out.println("That square has already been used. Choose another.");
	}
	
}


	}
System.out.println("     ------------------");
System.out.println("   Game Over");
if (winner.equals("draw")) {
	System.out.println("     This game is a " + winner + "!");
} else {
	System.out.println("       " + winner + " wins!");
}
System.out.println("     ------------------");
}}
