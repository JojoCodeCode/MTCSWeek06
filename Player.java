package week06lab;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//fields
	private List<Card> hand;
	private int score;
	private String name;
	
	//fields constructors
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	//describe method- prints info about player
	//calls describe method for each card in "hand" list
	public void describe(Player player) {
		System.out.println(player.getName() + " 's hand:");
		for (Card card: hand) {
			card.describe();}
		}
	//flip method- will remove top card of hand
	public Card flip() {
		//this will return the card 
		return hand.remove(0);
	}
	// draw method takes "Deck" as an argument- calls the draw method and
	// adds the returned Card to the hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	//method to keep score
	public void incrementScore() {
		score++;	
	}
	//getter for score and name because both are private above
public int getScore() {
	return score;
}
public String getName() {
	return name;
}
}
