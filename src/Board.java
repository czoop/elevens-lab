import java.util.ArrayList;
public class Board {
	private ArrayList<Card> cards;
	private Deck deck;
	
	public Board(Deck deck) {
		this.deck = deck;
		deck.shuffle();
		for (int i = 0; i < 11; i++) {
			cards.add(this.deck.deal());
		}
	}
	
	public ArrayList<Card> getLayout() {
		ArrayList<Card> newCards = cards;
		return newCards;
	}
	
	public String getLayoutAsString() {
		String str = "";
		int index = 0;
		while (index < cards.size()) {
			Card card = cards.get(index);
			str += index + ": " + card.toStringNoPoints() + "\n";
			index++;
		}
		return str;
	}
	
	public boolean canMakeMove(int card1, int card2) {
		if (card1 <= 9 && card2 <= 9) {
			if (cards.get(card1).getPoints() + cards.get(card2).getPoints() == 11) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void makeMove(int card1, int card2) {
		if (canMakeMove(card1, card2) && deck.size() >= 2) {
			cards.remove(card1);
			cards.remove(card2);
			cards.add(card1, deck.deal());
			cards.add(card2, deck.deal());
		}
	}
}
