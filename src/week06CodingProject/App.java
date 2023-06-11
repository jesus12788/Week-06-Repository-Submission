package week06CodingProject;

public class App {

	public static void main(String[] args) {
		
		 //Instantiate deck and two players, call the shuffle method on the deck. 
		Deck deck = new Deck();
		deck.shuffle();
		//Tom is player one "player" and Steve is player2.
		Player player = new Player("Tom");
		Player player2= new Player("Steve");
		
		//for loop. Call draw method on the other player each iteration.
	for (int i = 0; i < 52; i++) {
		if (i % 2 == 0) {
		player.draw(deck);
		} else {
		player2.draw(deck);
	}
		

	}
	player.describe();
	player2.describe();
	
	//Using traditional for loop, iterate 26 times and call the flip method for each player.
	for (int i = 0; i < 26; i++) {
		Card card = player.flip();
		Card card2 = player2.flip();
		 card.describe();
		 card2.describe();
		 /*Compare the value of each card returned by the two players flip methods.
		  * Call the incrementScore method on the player whose card had a higher value.
		  */
		 if (card.getValue() > card2.getValue()) {
			 player.incrementScore();
			 
		 } else if(card2.getValue() > card.getValue()) {
			 player2.incrementScore();
			 
		 }
		 System.out.println("Tom's score " + player.getScore());
		 System.out.println("Steve's score " + player2.getScore());
		 
		 
	}
	//Compare the final score from each player and print out final score for WINNER! || draw.
	if (player.getScore() > player2.getScore()) {
		System.out.println("Tom Wins " + player.getScore());
	} else if (player2.getScore() > player.getScore()) {
		System.out.println("Steve Wins " + player.getScore());
		
	} else
		System.out.println("Game is a draw");
    }
	
}