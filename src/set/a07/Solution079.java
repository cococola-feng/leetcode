package set.a07;

public class Solution079 {
	public boolean exist(char[][] board, String word) {
		if(board == null || board.length == 0 || board[0].length == 0){
			return false;
		}
		
		boolean[][] visited = new boolean[board.length][board[0].length];
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if(search(board, visited, word, 0, i, j, board.length, board[i].length)){
					return true;
				}
			}
		}
		return false;
    }
	
	private boolean search(char[][] board, boolean[][] visited, String word, int index, int x, int y, int raws, int cols){
		if(index >= word.length()){
			return true;
		}
		
		if(checkBoader(x, y, raws, cols) && !visited[x][y] && board[x][y]==word.charAt(index)){
			visited[x][y] = true;
			boolean rel = search(board, visited, word, index + 1, x - 1, y, raws, cols) ||
					search(board, visited, word, index + 1, x, y + 1, raws, cols) ||
					search(board, visited, word, index + 1, x + 1, y, raws, cols) ||
					search(board, visited, word, index + 1, x, y - 1, raws, cols);
			
			if(rel){
				return true;
			}else{
				visited[x][y] = false;
				return false;
			}
			
		}
		
		return false;
	}
	private boolean checkBoader(int x, int y, int raws, int cols){
		return x >= 0 && x < raws && y >=0 && y <cols;
	}
}
