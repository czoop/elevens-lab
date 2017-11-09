import java.util.Scanner;
public class BoardRunner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deck deck = new Deck();
		Board board = new Board(deck);
		int card1 = 0;
		int card2 = 0;
		int card3 = 0;
		System.out.println("Board Created!");
		
		while (board.movesLeft()) {
			System.out.println("-------------------------------------------");
			System.out.println(board.getLayoutAsString());
			System.out.println("What cards would you like to choose?");
			System.out.print("Card 1: ");
			card1 = input.nextInt();
			System.out.print("Card 2: ");
			card2 = input.nextInt();
			if (board.isFaceCard(card1)) {
				System.out.print("Card 3: ");
				card3 = input.nextInt();
				System.out.println(board.makeMoveFaceCards(card1, card2, card3));
			}
			else {
			System.out.println("Made Move: " + board.makeMove(card1, card2));
			}
			
		}
		
		System.out.println("\n" + 
				" _____ ____  _      _____   ____  _     _____ ____ \n" + 
				"/  __//  _ \\/ \\__/|/  __/  /  _ \\/ \\ |\\/  __//  __\\\n" + 
				"| |  _| / \\|| |\\/|||  \\    | / \\|| | //|  \\  |  \\/|\n" + 
				"| |_//| |-||| |  |||  /_   | \\_/|| \\// |  /_ |    /\n" + 
				"\\____\\\\_/ \\|\\_/  \\|\\____\\  \\____/\\__/  \\____\\\\_/\\_\\\n" + 
				"                                                   \n" + 
				"");
		
	}
}
