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
}
