package week6javafinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	b.i List of Card
	public List<Card> cards = new ArrayList<Card>();
	static int nextCard = 0;
	
//	constructor b.ii.3
	public Deck() {
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
		}
	}
//shuffle method b.ii.2
	public void shuffle () {
		Collections.shuffle(cards);
	}
//	draw method b.ii.2
	public Card draw() {
		Card newCard;
		if (nextCard < cards.size()) {
			newCard = cards.get(nextCard);
			cards.remove(nextCard);
			
		} 
		
		else newCard = null;
		return newCard;
		
	}
}
