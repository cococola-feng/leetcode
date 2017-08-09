package set.a12;

public class Solution130 {
	public void solve(char[][] board) {
		if(board == null || board.length == 0 || board[0].length == 0) return;
		int raws = board.length;
		int cols = board[0].length;
		
        for(int i = 0; i < raws; i++){
    		if(board[i][0] == 'O'){
    			detect(board, i, 0);
    		}
    		
    		if(board[i][cols - 1] == 'O'){
    			detect(board, i, cols - 1);
    		}
        }
        
        for(int i = 1; i < cols - 1; i++){
        	if(board[0][i] == 'O'){
        		detect(board, 0, i);
        	}
        	
        	if(board[raws - 1][i] == 'O'){
        		detect(board, raws - 1, i);
        	}
        }
        
        for(int i = 0; i < raws; i++){
        	for(int j = 0; j < cols; j++){
        		if(board[i][j] == 'O')	board[i][j] = 'X';
        		if(board[i][j] == 'o') board[i][j] = 'O';
        	}
        }
    }
	
	private void detect(char[][] board, int x, int y){
		if (x < 0 || x > board.length - 1 || y <0 || y > board[0].length - 1)
			return;
		if (board[x][y] == 'O')
			board[x][y] = 'o';
		
		if(x > 1 && board[x - 1][y] == 'O') detect(board, x - 1, y);
		if(y > 1 && board[x][y - 1] == 'O') detect(board, x, y - 1);
		if(x < board.length - 2 && board[x + 1][y] == 'O') detect(board, x + 1, y);
		if(y < board[0].length - 2 && board[x][y + 1] == 'O') detect(board, x, y + 1);
	}
	
	
}
