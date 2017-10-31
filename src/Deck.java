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
	
	public Deck(String[] ranks, String[] suits, Integer[] points) {
		cardDeck = new ArrayList<Card>();
		if (ranks.length == suits.length && suits.length == points.length) {
			for (int i = 0; i < ranks.length; i++) {
				cardDeck.add(new Card(ranks[i], suits[i], points[i]));
			}
			size = cardDeck.size();
		}
	}

	
	public void shuffle() {
		int k = cardDeck.size() - 1;
		while (k > 1) {
			int r = (int) Math.round(Math.random()*k);
			Card toSwap = cardDeck.get(r);
			cardDeck.set(r, cardDeck.get(k));
			cardDeck.set(k, toSwap);
			k--;
		}
	}
	
	public boolean isEmpty() {
		if (size == 0) {
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
	
	public void resetSize() {
		size = cardDeck.size();
	}
	
	public Card highestCard() {
		Card highCard = cardDeck.get(0);
		for (Card card : cardDeck) {
			if (card.getPoints() > highCard.getPoints()) {
				highCard = card;
			}
		}
		return highCard;
	}
	
	public Card lowestCard() {
		Card lowCard = cardDeck.get(0);
		for (Card card : cardDeck) {
			if (card.getPoints() < lowCard.getPoints()) {
				lowCard = card;
			}
		}
		return lowCard;
	}
	
	public void clearDeck() {
		while (cardDeck.size() > 0) {
			cardDeck.remove(0);
		}
	}
	
	public void sort() {
		ArrayList<Card> sorted = new ArrayList<Card>();
		int lowestVal = lowestCard().getPoints();
		int highestVal = highestCard().getPoints();
		int cardIndex = 0;
		while (lowestVal <= highestVal) {
			while (cardIndex < cardDeck.size()) {
				Card card = cardDeck.get(cardIndex);
				if (card.getPoints() == lowestVal) {
					sorted.add(card);
					cardDeck.remove(cardIndex);
				}
				cardIndex++;
			}
			lowestVal++;
			cardIndex = 0;
		}
		
		cardDeck = sorted;
	}
	
	@Override
	public String toString() {
		String str = "";
		for (Card card : cardDeck) {
			str += card + "\n";
		}
		return str;
	}
}
