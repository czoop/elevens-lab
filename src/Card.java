public class Card {
	private String rank;
	private String suit;
	private int points;
	
	public Card(String rank, String suit, int points) {
		this.rank = rank;
		this.suit = suit;
		this.points = points;
	}
	
	public boolean isEqual(Card cardToCompare) {
		if (cardToCompare.getRank().equals(rank) && 
			cardToCompare.getSuit().equals(suit) && 
			cardToCompare.getPoints() == points) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return rank + " of " + suit + " (Points: " + points + ")";
	}

	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public int getPoints() {
		return points;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
}
