
public class ThreeByThreeBoard extends Board {

	public ThreeByThreeBoard(){
		super(new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " "});
	}
	
	@Override
	public boolean hasWinner() {
		
		if (hasWinner(0,1,2)) return true;
		if (hasWinner(3,4,5)) return true;
		if (hasWinner(6,7,8)) return true;
		
		if (hasWinner(0,3,6)) return true;
		if (hasWinner(1,4,7)) return true;
		if (hasWinner(2,5,8)) return true;
		
		if (hasWinner(0,4,8)) return true;
		if (hasWinner(2,4,6)) return true;

		return false;
	}
	
}
