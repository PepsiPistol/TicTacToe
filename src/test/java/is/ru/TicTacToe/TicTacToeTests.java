package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TicTacToeTests {

	@Test
	public void testInsertOnPosition0() {
		TicTacToe ttt = new TicTacToe();
		ttt.insert(0);
		assertEquals(1,ttt.getValueAtPos(0));
	}

	@Test
	public void testInsertOnTaken() {
		TicTacToe ttt = new TicTacToe();
		ttt.insert(2);
		ttt.insert(2);
		assertEquals(1, ttt.getValueAtPos(2));
	}

	@Test
	public void testInsertOutOfBounds() {
		TicTacToe ttt = new TicTacToe();
		boolean exceptionCaught = false;
		try {
			ttt.insert(-1);
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
	
	@Test
	public void testTwoInserts() {
		TicTacToe ttt = new TicTacToe();
		ttt.insert(0);
		ttt.insert(1);
		assertEquals(2, ttt.getValueAtPos(1));
	}
	
	@Test
	public void testThreeInserts() {
		TicTacToe ttt = new TicTacToe();
		ttt.insert(0);
		ttt.insert(1);
		ttt.insert(2);
		assertEquals(1, ttt.getValueAtPos(2));
	}
}
