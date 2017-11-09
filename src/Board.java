import java.util.ArrayList;
public class Board {
	private ArrayList<Card> cards;
	private Deck deck;
	
	public Board(Deck newDeck) {
		cards = new ArrayList<Card>();
		deck = newDeck;
		deck.shuffle();
		for (int i = 0; i < 11; i++) {
			cards.add(deck.deal());
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
		if (card1 <= 9 && card2 <= 9 && cards.get(card1).getPoints() + cards.get(card2).getPoints() == 11) {
				return true;
		}
		else {
			return false;
		}
	}
	
	public boolean makeMove(int card1, int card2) {
		if (canMakeMove(card1, card2) && deck.size() >= 2) {
			cards.remove(card1);
			cards.remove(card2);
			cards.add(card1, deck.deal());
			cards.add(card2, deck.deal());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean makeMoveFaceCards(int card1, int card2, int card3) {
		if (isFaceCard(card1) && isFaceCard(card2) && isFaceCard(card3)) {
			int points1 = cards.get(card1).getPoints();
			int points2 = cards.get(card2).getPoints();
			int points3 = cards.get(card3).getPoints();
			
			if ((points1 == 11 || points1 == 12 || points1 == 13) && 
					(points2 == 11 || points2 == 12 || points2 == 13) &&
					(points3 == 11 || points3 == 12 || points3 == 13)) {
				cards.remove(card1);
				cards.remove(card2);
				cards.remove(card3);
				cards.add(card1, deck.deal());
				cards.add(card2, deck.deal());
				cards.add(card3, deck.deal());
				return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean isFaceCard(int card1) {
		int points = cards.get(card1).getPoints();
		if (points == 11 || points == 12 || points == 13) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean movesLeft() {
		int dex1 = 0;
		int dex2 = 0;
		while (dex1 < cards.size()) {
			while (dex2 < cards.size()) {
				if (canMakeMove(dex1, dex2)) {
					return true;
				}
				dex2++;
			}
		}
		return false;
	}
}
