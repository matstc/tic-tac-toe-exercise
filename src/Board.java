
public class Board {

	private String[] squares = new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " "};

	@Override
	public String toString() {
		return String.format("%s | %s | %s\n---------\n%s | %s | %s\n---------\n%s | %s | %s", (Object[])squares);
	}
}
