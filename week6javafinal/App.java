package week6javafinal;

public class App {
	
//scanner to pass two strings in Player class
	public static String name1;
	public static String name2;
		
	public static void main(String[] args) {
	//these three lines instantiates the 2 players and the deck
	Player player1 = new Player(name1);
	Player player2 = new Player(name2);
	Deck deck1 = new Deck();
		
//shuffle method in deck we just instantiated
	deck1.shuffle();
			
//for loop draws cards for each player until there are none left in the deck
		for(int i=0; i<52;i++) {
//draw method is called for each player
			player1.draw(deck1);
			player2.draw(deck1);
			}
//describe method is called here for each player to show their whole hand before the game is played to ensure the program is pulling the top card from their hand each time
		player1.describe();
		System.out.println();
		player2.describe();
		System.out.println();
//for loop below is for each player
		for(int i=0; i<26;i++) {
//instantiated two Card objects to assign the values of each card drawn to
			Card card1;
			Card card2;
//calls the flip method for both players
			card1 = player1.flip(null);
			card2 = player2.flip(null);
			//informational block below prints out the name of each player using the getName method and the name of each card using the describe method, also prints some additional lines
			System.out.println(player1.getName() + " draws:");
			card1.describe();
			System.out.println(player2.getName() + " draws:");
			card2.describe();
			System.out.println();
				
//checks to see which player wins or if its a draw and increase the winner's score
			if(card1.getValue()>card2.getValue()) {
			System.out.println(player1.getName() + " wins this round.");
			player1.incrementScore();
				}
			else if (card1.getValue()<card2.getValue()){
			System.out.println(player2.getName() + " wins this round.");
					player2.incrementScore();
			}
			else {
				System.out.println("Round One: Draw.");
			}
// current score of the game after round
				System.out.println("Current score is " + player1.getName() + " : " + player1.getScore() + " points, and "+ player2.getName()+ " : " + player2.getScore() + " points.");
				System.out.println();			
			}
			
//final score of the game
				System.out.println("The final score is:");
				System.out.println(player1.getName() + " : " + player1.getScore()+ " points.");
				System.out.println(player2.getName() + " : " + player2.getScore()+ " points.");
//if else statement below determines the winner of the game
			if(player1.getScore()> player2.getScore()) {
				System.out.println(player1.getName() + " wins.");
			} else if(player1.getScore()<player2.getScore()) {
				System.out.println(player2.getName() + " wins.");
			} else {
				System.out.println("The game is a draw.");
			}
			
			
			}
	

}
