public abstract class Board {

	protected String[] squares;

	public static Board createFourByFourBoard() {
		return new FourByFourBoard();
	}
	
	public static Board createBoard(){
		return new ThreeByThreeBoard();
	}

	protected Board(String[] squares) {
		this.squares = squares;
	}

	public abstract boolean hasWinner();

	public void playX(Integer index) {
		play("X", index);
	}

	public void playO(Integer index) {
		play("O", index);
	}
	
	protected boolean hasWinner(Integer... predicates) {
		if (!occupied(predicates[0])) return false;
		
		String token = squares[predicates[0]];
		for (Integer predicate : predicates){
			if (token != squares[predicate])
				return false;
		}
		
		return true;
	}
	
	private void play(String token, Integer index) {
		if (occupied(index))
			throw new RuntimeException("You cannot play in a square that is already occupied");
		
		squares[index] = token;
	}

	private boolean occupied(Integer index) {
		return !squares[index].equals(" ");
	}
	
	@Override
	public String toString() {
		return String.format("%s | %s | %s\n" +
				             "---------\n" +
				             "%s | %s | %s\n" +
				             "---------\n" +
				             "%s | %s | %s", (Object[])squares);
	}
}
