import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> cardDeck;
	private int size;
	
	public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> points) {
		cardDeck = new ArrayList<Card>();
		if (ranks.size() == suits.size() && suits.size() == points.size()) {
			for (int i = 0; i < ranks.size(); i++) {
				cardDeck.add(new Card(ranks.get(i), suits.get(i), points.get(i)));
			}
			size = cardDeck.size();
			this.shuffle();
		}
	}
	
	public void shuffle() {
		
	}
	
	public boolean isEmpty() {
		if (cardDeck.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return size;
	}
	
	public Card deal() {
		if (size != 0) {
			Card returnCard = cardDeck.get(size - 1);
			size--;
			return returnCard;
		}
		else {
			return null;
		}
	}
}
