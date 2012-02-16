import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TicTacTest {

	@Test
	public void shouldDisplayBoard() throws Exception {
		String output = new Board().toString();
		assertEquals("  |   |  \n" +
				     "---------\n" +
				     "  |   |  \n" +
				     "---------\n" +
				     "  |   |  ", output);
	}

	@Test
	public void shouldPlayACrossInTheTopLeft() throws Exception {
		Board board = new Board();
		
		board.playX(0);
		
		assertEquals("X |   |  \n" +
				     "---------\n" +
				     "  |   |  \n" +
				     "---------\n" +
				     "  |   |  ", board.toString());
	}

}
