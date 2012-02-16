
public class ThreeByThreeGrid implements Grid {

	public boolean hasWinner(Board board){ 
		
		if (board.allOccupiedBySamePlayer(0,1,2)) return true;
		if (board.allOccupiedBySamePlayer(3,4,5)) return true;
		if (board.allOccupiedBySamePlayer(6,7,8)) return true;
		
		if (board.allOccupiedBySamePlayer(0,3,6)) return true;
		if (board.allOccupiedBySamePlayer(1,4,7)) return true;
		if (board.allOccupiedBySamePlayer(2,5,8)) return true;
		
		if (board.allOccupiedBySamePlayer(0,4,8)) return true;
		if (board.allOccupiedBySamePlayer(2,4,6)) return true;

		return false;
	}

	public String displayString() {
		return "%s | %s | %s\n" +
	            "---------\n" +
	           "%s | %s | %s\n" +
	            "---------\n" +
	           "%s | %s | %s";
	}
	
}
