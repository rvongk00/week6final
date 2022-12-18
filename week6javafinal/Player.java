package week6javafinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
//c.i.1,2,3 hand, score & name 
	public List<Card> hand = new ArrayList<Card>();
	public int score;
	public String name;
	
	static Scanner s = new Scanner(System.in);
//	set to 0 constructor
	public Player (String playerName) {
		setName(playerName);
		setScore(0);
		
	}
	
	public int getScore() {
		return score;
	}
	
	//setter for score
		public void setScore(int score) {
			this.score = score;
		}

		//getter for name
		public String getName() {
			return name;
		}

		//setter for name
		public void setName(String name) {
			//prompts user to enter in the name for each player instantiated in the main method
			System.out.println("Player: ");
			name = s.next();
			this.name = name;
		}
		//c.ii.3. draw method
		public Deck draw(Deck cards) {
			//adds a card to the hand list from the deck variable cards
			hand.add(cards.draw());
			return cards;
			
		}
		
		//c.ii.2 flip method, removes and returns top card of the hand
		public Card flip(Card topCard) {
			topCard = hand.get(0);
			hand.remove(0);
			return topCard;
		}
		
		//c.ii.1 describe method for info on player and calls each card in Hand List
			public void describe() {
				//prints out the name of the player and their current score
				System.out.println(name + "'s score is " + score);
				System.out.println("The cards in your hand are: ");
				//for loop prints out all cards the player drew
				for(int i = 0; i<hand.size(); i++) {
					if(hand.get(i) != null) {
						hand.get(i).describe();			
					}
				}
			}
		
		//c.ii.4 increment score method when this is called the players score will go up by 1
		public void incrementScore() {
			score++;
		}

}
