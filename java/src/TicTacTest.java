import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.Test;

public class TicTacTest {

	@Test
	public void shouldDisplayBoard() throws Exception {
		String output = Board.createBoard().toString();
		assertEquals("  |   |  \n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", output);
	}

	@Test
	public void shouldPlayACrossInTheTopLeft() throws Exception {
		Board board = Board.createBoard();

		board.playX(0);

		assertEquals("X |   |  \n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldPlayANaughtInTheTopRight() throws Exception {
		Board board = Board.createBoard();

		board.playO(2);

		assertEquals("  |   | O\n" + "---------\n" + "  |   |  \n"
				+ "---------\n" + "  |   |  ", board.toString());
	}

	@Test
	public void shouldNotBeAbleToPlayInOccupiedSquare() throws Exception {
		Board board = Board.createBoard();

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
		Board board = Board.createBoard();
		board.playX(0);
		board.playX(1);
		assertFalse(board.hasWinner());
		board.playX(2);
		assertTrue(board.hasWinner());
	}

	@Test
	public void shouldDetectWinnerInTheSecondColumn() {
		Board board = Board.createBoard();
		board.playX(0);
		board.playX(3);
		assertFalse(board.hasWinner());
		board.playX(6);
		assertTrue(board.hasWinner());
	}
	
	@Test
	public void shouldDetectWinnerInDiagonal() {
		Board board = Board.createBoard();
		board.playX(0);
		board.playX(4);
		assertFalse(board.hasWinner());
		board.playX(8);
		assertTrue(board.hasWinner());
	}
	
	@Test(expected=RuntimeException.class)
	public void shouldNotAllowMovesOutsideTheGrid(){
		Board board = Board.createBoard();
		board.playX(9);		
	}
	
	@Test(expected=RuntimeException.class)
	public void shouldNotAllowNegativeMoves(){
		Board board = Board.createBoard();
		board.playX(-1);		
	}
	
	@Test
	public void shouldAllowPlayOn4x4(){
		Board board = Board.createFourByFourBoard();
		board.playX(11);		
		board.playX(10);
		board.playX(9);
		assertFalse(board.hasWinner());
		board.playX(8);
		assertTrue(board.hasWinner());
	}
}
