import java.util.ArrayList;
public class DeckTester {
	public static void main(String[] args) {
		ArrayList<String> ranks = new ArrayList<String>();
		ArrayList<String> suits = new ArrayList<String>();
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		ranks.add("Ace");
		ranks.add("King");
		ranks.add("Queen");
		suits.add("Spades");
		suits.add("Clubs");
		suits.add("Hearts");
		points.add(1);
		points.add(13);
		points.add(12);
		
		Deck d = new Deck(ranks, suits, points);
		System.out.println(d.size());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		
	}
}
