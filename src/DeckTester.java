import java.util.ArrayList;
public class DeckTester {
	public static void main(String[] args) {
		/*
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
		*/
		
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades"};
		Integer[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		//Deck d = new Deck(ranks, suits, points);
		Deck d = new Deck();
		
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		d.sort();
		System.out.println(d);
		
		/*
		System.out.println(d.size());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d.isEmpty());
		*/
	}
}
