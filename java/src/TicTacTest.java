import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.Test;

public class TicTacTest {

	@Test
	public void shouldDisplayBoard() throws Exception {
		String output = new Board().toString();
		assertEquals("  |   |  \n" + "---------\n" + "  |   |  \n" + "---------\n" + "  |   |  ", output);
	}

	@Test
	public void shouldPlayACrossInTheTopLeft() throws Exception {
		Board board = new Board();

		board.playX(0);

		assertEquals("X |   |  \n" + "---------\n" + "  |   |  \n" + "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldPlayANaughtInTheTopRight() throws Exception {
		Board board = new Board();

		board.playO(2);

		assertEquals("  |   | O\n" + "---------\n" + "  |   |  \n" + "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldNOtBeAbleToPlayInOccupiedSquare() throws Exception {
		Board board = new Board();

		for (int i = 0; i < 9; i++) {
			board.playX(i);
			try {
				board.playO(i);
				Assert.fail();
			} catch (Exception e) {

			}
		}

		board = new Board();

		for (int i = 0; i < 9; i++) {
			board.playO(i);
			try {
				board.playX(i);
				Assert.fail();
			} catch (Exception e) {

			}
		}

	}
}
