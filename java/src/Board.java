public class Board {

	private String[] squares = new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " "};

	@Override
	public String toString() {
		return String.format("%s | %s | %s\n---------\n%s | %s | %s\n---------\n%s | %s | %s", (Object[])squares);
	}

	public void playX(Integer index) {
		play("X", index);
	}

	public void playO(Integer index) {
		play("O", index);
	}

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

	private void play(String token, Integer index) {
		if (occupied(index))
			throw new IllegalArgumentException();
		
		squares[index] = token;
	}

	private boolean occupied(Integer index) {
		return !squares[index].equals(" ");
	}

	private boolean hasWinner(Integer a, Integer b, Integer c) {
		return (occupied(a)) && (squares[a].equals(squares[b])) && (squares[b].equals(squares[c]));
	}
}
