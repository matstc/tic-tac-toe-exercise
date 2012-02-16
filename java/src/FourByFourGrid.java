
public class FourByFourGrid implements Grid {

	public boolean hasWinner(Board board) {
		
		if (board.allOccupiedBySamePlayer(0, 1, 2, 3)) return true;
		if (board.allOccupiedBySamePlayer(4, 5, 6, 7)) return true;
		if (board.allOccupiedBySamePlayer(8, 9, 10, 11)) return true;
		if (board.allOccupiedBySamePlayer(12, 13, 14, 15)) return true;
		
		if (board.allOccupiedBySamePlayer(0, 4, 8, 12)) return true;
		if (board.allOccupiedBySamePlayer(1, 5, 9, 13)) return true;
		if (board.allOccupiedBySamePlayer(2, 6, 10, 14)) return true;
		if (board.allOccupiedBySamePlayer(3, 7, 11, 15)) return true;
		
		if (board.allOccupiedBySamePlayer(0, 5, 10, 15)) return true;
		if (board.allOccupiedBySamePlayer(3, 6, 9, 12)) return true;

		return false;
	}
	
	public String displayString() {
		
		return "%s | %s | %s | %s\n" +
	             "-------------\n" +
	           "%s | %s | %s | %s\n" +
	             "-------------\n" +
	           "%s | %s | %s | %s\n" +
	             "-------------\n" +
	           "%s | %s | %s | %s";
	}

}
