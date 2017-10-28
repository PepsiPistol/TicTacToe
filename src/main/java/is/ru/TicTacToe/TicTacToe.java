package is.ru.TicTacToe;

public class TicTacToe {
	
	byte[] grid;
	int player;
	public TicTacToe() {
		//grid uses three status values:
		//0: field is empty
		//1: field has X
		//2: field has O
		grid = new byte[9];
		//two players, player 0 and player 1
		player = 0;
		for(int i = 0; i<grid.length; i++) {
			grid[i] = 0;	
		}
	}

	public void insert(int pos) {
		if(validatePos(pos)) {
			if(grid[pos] == 0) {
				grid[pos] = (byte)(player + 1);
				//update which player plays next
				player = (byte)(player + 1)%2;
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
	
	public void clear() {
		for(int i = 0; i < 9; i++) {
			grid[i] = 0;
		}
		player = 0;
	}

	//returns byte as game status:
	//0: game is still going
	//1: player 0 won
	//2: player 1 won
	//3: game tied
	public int getGameStatus (){
		//check whether game is tied.
		boolean tied = false;
		for(int i = 0; i<9; i++) {
			if(grid[i] == 0) {
				break;
			}
			if(i == 8 && grid[i] != 0) {
				tied = true;
			}
		}
		if(tied) {
			return 3;
		}
		//check whether game is won.
		if(grid[4] != 0) {
			if(grid[0] == grid[4] && grid[4] == grid[8]) {
				return grid[4];
			}
			if(grid[1] == grid[4] && grid[4] == grid[7]) {
				return grid[4];
			}
			if(grid[2] == grid[4] && grid[4] == grid[6]) {
				return grid[4];
			}
			if(grid[3] == grid[4] && grid[4] == grid[5]) {
				return grid[4];
			}
		}
		if(grid[0] != 0) {
			if(grid[0] == grid[1] && grid[1] == grid[2]) {
				return grid[0];
			}
			if(grid[0] == grid[3] && grid[3] == grid[6]) {
				return grid[0];
			}
		}
		if(grid[8] != 0) {
			if(grid[2] == grid[5] && grid[5] == grid[8]) {
				return grid[8];
			}
			if(grid[6] == grid[7] && grid[7] == grid[8]) {
				return grid[8];
			}
		}
		//if game isn't tied nor a player has won, then the game is still going.
		return 0;
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to tic tac toe!");


	}

}

