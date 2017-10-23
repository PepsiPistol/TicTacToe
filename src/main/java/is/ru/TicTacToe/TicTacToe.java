package is.ru.TicTacToe;

public class TicTacToe {
	
	byte[] grid;
	public TicTacToe(){
		grid = new byte[9];

		for(int i = 0; i<grid.length; i++) {
			grid[i] = 0;	
		}
	}

	public void insertX(int pos) {
		grid[pos] = 1;
	}

	public void insertY(int pos) {
		grid[pos] = 2;
	}
	
	public byte getValueAtPos(int pos) {
		return grid[pos];
	}
	public static void main(String[] args) {

		System.out.println("Welcome to tic tac toe!");


	}

}

