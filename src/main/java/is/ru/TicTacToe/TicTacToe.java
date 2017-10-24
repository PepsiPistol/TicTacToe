package is.ru.TicTacToe;

public class TicTacToe {
	
	byte[] grid;
	public TicTacToe() {
		grid = new byte[9];

		for(int i = 0; i<grid.length; i++) {
			grid[i] = 0;	
		}
	}

	public void insertX(int pos) {
		if(validatePos(pos)) {
			if(grid[pos] == 0) {
				grid[pos] = 1;
			}
		}
	}

	public void insertO(int pos) {
		if(validatePos(pos)) {
			if(grid[pos] == 0) {
				grid[pos] = 2;
			}
		}
	}
	
	public byte getValueAtPos(int pos) {
		if(validatePos(pos)) {
			return grid[pos];
		}
		return -1;
	}

	public boolean validatePos(int pos) {
		if((0 <= pos) && (pos < grid.length)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to tic tac toe!");


	}

}

