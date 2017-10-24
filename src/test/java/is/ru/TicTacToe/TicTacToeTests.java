package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TicTacToeTests {

	@Test
	public void testXOnPosition0() {
		TicTacToe ttt = new TicTacToe();
		ttt.insertX(0);
		assertEquals(1,ttt.getValueAtPos(0));
	}

	@Test
	public void testInsertOnTaken() {
		TicTacToe ttt = new TicTacToe();
		ttt.insertO(2);
		ttt.insertX(2);
		assertEquals(2, ttt.getValueAtPos(2));
	}

	@Test
	public void testInsertOutOfBounds() {
		TicTacToe ttt = new TicTacToe();
		boolean exceptionCaught = false;
		try {
			ttt.insertX(-1);
		}catch(Exception e) {
			exceptionCaught = true;
		}
		assertEquals(false, exceptionCaught);
	}

	@Test
	public void testGetValueOutOfBounds() {
		TicTacToe ttt = new TicTacToe();
		assertEquals(-1, ttt.getValueAtPos(12));
	}
}
