public class CardTester {
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Spades", 10);
		Card card2 = new Card("King", "Clubs", 10);
		Card card3 = new Card("Ace", "Spades", 10);
		
		System.out.println(card1 + " is equal to " + card2 + ": " + card1.isEqual(card2));
	}
}
