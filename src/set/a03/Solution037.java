package set.a03;

import java.util.HashSet;
import java.util.Set;

public class Solution037 {
	private int len = 9;
	private Set<Character> copy = null;
	
	public void solveSudoku(char[][] board) {
		copy = new HashSet<Character>();
		
		for (char c = '1'; c <= '9'; c++) {
			copy.add(c);
		}
		
        solve(board);
    }
    
    public boolean solve(char[][] board){
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(board[i][j] == '.'){
                	Set<Character> valid = getValid (board, i, j);
                    for(Character c : valid){
                        board[i][j] = c;
                        
                        if(solve(board))
                            return true;
                        else
                            board[i][j] = '.'; 
                    }
                    
                    return false;
                }
            }
        }
        return true;
    }

	private Set<Character> getValid(char[][] board, int i, int j) {
		Set<Character> rentangle = new HashSet<Character>(copy);
		Set<Character> raw = new HashSet<Character>(copy);
		Set<Character> col = new HashSet<Character>(copy);
		Set<Character> rel = new HashSet<Character>();

		for (int k = 0; k < len; k++) {
			if (board[i][k] != '.') {
				raw.remove(board[i][k]);
			}
			if (board[k][j] != '.') {
				col.remove(board[k][j]);
			}
		}

		int sx = (i / 3) * 3;
		int sy = (j / 3) * 3;

		for (int s = 0; s < 3; s++){
			for (int t = 0; t < 3; t++){
				if(board[sx + s][sy + t] != '.'){
					rentangle.remove(board[sx + s][sy + t]);
				}
			}
		}
		
		for(char ch : copy){
			if(rentangle.contains(ch) && raw.contains(ch) && col.contains(ch)){
				rel.add(ch);
			}
		}
		
		return rel;
	}
}
