package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//List of Card
	List<Card> hand = new ArrayList<Card>();
	//Fields
	String name;
	int score;
	//constructor score set to 0.
	Player(String name){
		this.name = name;
		this.score = 0;
		
		/*Methods
		 * describe
		 * draw
		 * flip
		 * increment score
		 * getters and setter for class Player.
		 */
		
	}
	
	public void describe() {
		System.out.print(this.name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public void draw(Deck deck) {
	hand.add(deck.draw());
	
		
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	public void incrementScore() {
		this.score++;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
