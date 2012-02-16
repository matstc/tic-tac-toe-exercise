
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

	private void play(String token, Integer index) {
		squares[index] = token;
	}

}
