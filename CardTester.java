/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("jack", "spade", 11);
		Card card2 = new Card("jack", "spade", 11);
		if (card1.matches(card2)){
		System.out.println("Good Job");
	}
	}
}
