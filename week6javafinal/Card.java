package week6javafinal;
//1.a
public class Card {
//	suit names & card value variables 1.a.i
	public int value;
	public String name;
	static String [] suit = {"Diamonds", "Spades", "Hearts", "Clubs"};
	static String [] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	
//	constructor
	public Card(int cardValue) {
//		setValue method 
		setValue(cardValue);
//		setName method
		setName(cardValue);
		
	}
//	1.a.ii getters and setters & prints
//	setter for value
	
	public void setValue (int value) {
		
		if (value >=0 && value <=51) {
			this.value = value%13+2;
			
		}
	}
//	getter for value of card
	public int getValue() {
		return value;
	}
//	setter for name
	public void setName (int numbers) {
//		loops through number input parameters
		if (numbers >=0 && numbers <= 51) {
			this.name = Card.numbers[numbers%13] + " of " + Card.suit[numbers/13];
			
		}
	}
//	getter for name of card
	public String getName() {
		return name;
		
	}
//	print name & value
	public void describe () {
		System.out.println(name);
		
	}
}
