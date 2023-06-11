package week06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;






public class Deck {
	//Fields a List of Card
	List<Card> cards = new ArrayList<Card>();
	
	//Constructor
	Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] valueOfCards = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		//enhanced for loop start count at 2 which is lowest value to 14 which is highest.
		for (String suit : suits) {
			int count = 2;
			for (String valueOfCard : valueOfCards) {
				Card card = new Card(valueOfCard, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	
	}

	/*Methods
	 * shuffle
	 * draw
	 * describe
	 */

	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		
		
	}

	public void describe() {
		for (Card card : this.cards) {
			card.describe();

			
		}
	}
}
