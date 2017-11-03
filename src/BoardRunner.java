import java.util.Scanner;
public class BoardRunner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deck deck = new Deck();
		Board board = new Board(deck);
		
		System.out.println(board.getLayoutAsString());
	}
}
