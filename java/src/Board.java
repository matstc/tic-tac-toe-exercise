import java.util.Arrays;
import java.util.List;

public class Board {

	private List<String> squares;
	private Grid grid;

	public static Board createFourByFourBoard() {
		return new Board(Arrays.asList(" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "), new FourByFourGrid());
	}
	
	public static Board createBoard(){
		return new Board(Arrays.asList(" "," "," "," "," "," "," "," "," "), new ThreeByThreeGrid());
	}

	private Board(List<String> squares, Grid grid) {
		this.squares = squares;
		this.grid = grid;
	}

	public boolean hasWinner(){
		return grid.hasWinner(this);
	}

	public void playX(Integer index) {
		play("X", index);
	}

	public void playO(Integer index) {
		play("O", index);
	}
	
	public boolean allOccupiedBySamePlayer(Integer... squareIndexes) {
		if (!occupied(squareIndexes[0])) return false;

		String symbol = squares.get(squareIndexes[0]);
		for (Integer predicate : squareIndexes){
			if (!symbol.equals(squares.get(predicate)))
				return false;
		}
		
		return true;
	}
	
	private void play(String symbol, Integer index) {
		if (occupied(index))
			throw new RuntimeException("You cannot play in a square that is already occupied");
		
		squares.set(index, symbol);
	}

	private boolean occupied(Integer index) {
		return !squares.get(index).equals(" ");
	}
	
	@Override
	public String toString() {
		return String.format(grid.displayString(), squares.toArray());
	}
}
