package week06CodingProject;



public class Card {
	//Fields
	String name;
	String suit;
	int value;
	//constructor
	Card(String name, String suit, int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	//getters and setters + describe method
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}



	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}





	public void describe() {
		System.out.println(this.name);
		System.out.println(this.suit);
		System.out.println(this.value);
	}

}
