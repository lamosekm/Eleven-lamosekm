/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                
                // REUSABLE ASSETS
            String[] suits = {"clubs", "hearts", "diamonds", "spades"};
            String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
            int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            
            // NEW ASSETS
            String[] students = {"Danny", "Mitch", "Joe", "Liam", "Everett"};
            String[] eyeColor = {"blue", "black", "red", "green", "brown"};
            int[] individualGrade = {60, 65, 70, 75, 80, 85, 90, 95};
            
            /**** EXAMPLE DECK 1 ****/
            System.out.println("----TESTING DECK 1----");
            
            // create a deck (instantiating a deck) (inside the deck is an arrayList)
            Deck dMoney = new Deck(ranks, suits, pointValues);
            
            // test its size (unit tests.  Testing every unit of my class)
            System.out.println(dMoney.size());
            
            // deal one card
            Card x = dMoney.deal();
            System.out.println("Yo homie, I just dealt this card: " + x);
            System.out.println("Now my deck size is: " + dMoney.size());
            
            // test two string
            System.out.println(dMoney);
            
            /**** EXAMPLE DECK 2 ****/
            System.out.println("----TESTING DECK 2----");
            
            // create a deck
            Deck dEasy = new Deck(ranks, suits, pointValues);
            // test its size
            
            // deal until empty
            while(!dEasy.isEmpty()){
                dEasy.deal();
            }
            
            System.out.println(dEasy);
            
	}
}

