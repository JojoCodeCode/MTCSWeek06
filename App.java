package week06lab;

import java.util.Collections;

public class App {
	public static void main(String[] args) {
	//instantiate Deck and two players
	Deck deck = new Deck();
	Player player1 = new Player("Player 1");
	Player player2 = new Player("Player 2");
	// shuffle the deck
	deck.shuffle();
	//each player draws 26 cards
for (int i=0; i<26; i++) {
	player1.draw(deck);
	player2.draw(deck);
}
	for (int j=0; j<26; j++) {
		System.out.println("Round " + (j+1) + ":");
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		System.out.print("Player 1 draws: ");
		player1Card.describe();
		System.out.print("Player 2 draws: ");
		player2Card.describe();
		
//comparing cards
		if (player1Card.getValue()>player2Card.getValue()) {
			System.out.println(player1.getName() + " wins 1 point!");
			player1.incrementScore();
		} else if (player2Card.getValue()>player1Card.getValue()) {
			System.out.println(player2.getName() + " wins 1 point!");
			player2.incrementScore();
		} else {
			System.out.println("It's a tie. No one gets a point. :(");
		}
		System.out.println();
		System.out.println("Current Scores:");
		System.out.println("Player 1 score: " + player1.getScore());
		System.out.println("Player 2 score: " + player2.getScore());
		System.out.println();
	}
// comparing scores
		System.out.println("Final Scores: ");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName()+ ": " + player2.getScore());
		if (player1.getScore() == player2.getScore()) {
			System.out.println("No one won- it's a tie!");
		} else if (player1.getScore()>player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
		
	}}

