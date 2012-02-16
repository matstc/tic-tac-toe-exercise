import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.Test;

public class TicTacTest {

	@Test
	public void shouldDisplayBoard() throws Exception {
		String output = new Board().toString();
		assertEquals("  |   |  \n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", output);
	}

	@Test
	public void shouldPlayACrossInTheTopLeft() throws Exception {
		Board board = new Board();

		board.playX(0);

		assertEquals("X |   |  \n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldPlayANaughtInTheTopRight() throws Exception {
		Board board = new Board();

		board.playO(2);

		assertEquals("  |   | O\n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldNotBeAbleToPlayInOccupiedSquare() throws Exception {
		Board board = new Board();

		try {
			board.playX(0);
			board.playO(0);
			Assert.fail();
		} catch (Exception e) {
		}
		
		assertEquals("X |   |  \n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldDetectWinnerInTheFirstRow() {
		Board board = new Board();
		board.playX(0);
		board.playX(1);
		assertFalse(board.hasWinner());
		board.playX(2);
		assertTrue(board.hasWinner());
	}

	@Test
	public void shouldDetectWinnerInTheSecondColumn() {
		Board board = new Board();
		board.playX(0);
		board.playX(3);
		assertFalse(board.hasWinner());
		board.playX(6);
		assertTrue(board.hasWinner());
	}
	
	@Test
	public void shouldDetectWinnerInDiagonal() {
		Board board = new Board();
		board.playX(0);
		board.playX(4);
		assertFalse(board.hasWinner());
		board.playX(8);
		assertTrue(board.hasWinner());
	}
}
