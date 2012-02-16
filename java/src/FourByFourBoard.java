
public class FourByFourBoard extends Board {

	public FourByFourBoard(){
		super(new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "});
	}
	
	@Override
	public boolean hasWinner() {
		
		if (hasWinner(0, 1, 2, 3)) return true;
		if (hasWinner(4, 5, 6, 7)) return true;
		if (hasWinner(8, 9, 10, 11)) return true;
		if (hasWinner(12, 13, 14, 15)) return true;
		
		if (hasWinner(0, 4, 8, 12)) return true;
		if (hasWinner(1, 5, 9, 13)) return true;
		if (hasWinner(2, 6, 10, 14)) return true;
		if (hasWinner(3, 7, 11, 15)) return true;
		
		if (hasWinner(0, 5, 10, 15)) return true;
		if (hasWinner(3, 6, 9, 12)) return true;

		return false;
	}

}
