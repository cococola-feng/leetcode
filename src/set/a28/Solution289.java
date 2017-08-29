package set.a28;

public class Solution289 {
	public void gameOfLife(int[][] board) {
		int raws = board.length;
		int cols = board[0].length;

		int[][] copy = new int[raws][cols];

		for (int i = 0; i < raws; i++) {
			for (int j = 0; j < cols; j++) {
				copy[i][j] = board[i][j];
			}
		}

		for (int i = 0; i < raws; i++) {
			for (int j = 0; j < cols; j++) {
				int count = 0;
				if (i > 0 && j > 0 && copy[i - 1][j - 1] == 1)
					count++;
				if (i > 0 && copy[i - 1][j] == 1)
					count++;
				if (i > 0 && j < cols - 1 && copy[i - 1][j + 1] == 1)
					count++;
				if (j > 0 && copy[i][j - 1] == 1)
					count++;
				if (j > 0 && i < raws - 1 && copy[i + 1][j - 1] == 1)
					count++;
				if (i < raws - 1 && copy[i + 1][j] == 1)
					count++;
				if (i < raws - 1 && j < cols - 1 && copy[i + 1][j + 1] == 1)
					count++;
				if (j < cols - 1 && copy[i][j + 1] == 1)
					count++;
				
				if(copy[i][j] == 1 && (count < 2 || count > 3)){
					board[i][j] = 0;
				}
				
				if(copy[i][j] == 0 && count == 3){
					board[i][j] = 1;
				}
			}
		}
	}
}
