package week06lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//field- list of card
private List<Card> deck = new ArrayList<Card>();

//creating the deck- constructor
	public Deck() {
String [] suits= {"Hearts", "Clubs", "Diamonds", "Spades"};
String [] cardNumbers = {"two", "three", "four", "five", "six", 
		"seven", "eight", "nine", "ten", 
		"jack", "queen", "king", "ace"};
//loop to make each specific card
for (String suit: suits) {
	int value = 2;
	for (String number: cardNumbers) {
		Card card = new Card(number, suit, value);
		this.deck.add(card);
		value++; }}
	}
	//shuffle method
	public void shuffle() {
		Collections.shuffle(this.deck);
}  
	//draw method
	public Card draw(){
	Card card = this.deck.remove(0);
	return card;
}
	}






	

	


