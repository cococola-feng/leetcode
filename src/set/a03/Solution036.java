package set.a03;

import java.util.HashSet;

public class Solution036 {
	public boolean isValidSudoku(char[][] board) {
		boolean rel = false;
		int length = 9;
		
		for(int i =0; i < length; i ++){
			rel = check(board, i, i + 1, 0, length);
			if(!rel){
				return false;
			}
			
			rel = check(board, 0, length, i, i+1);
			if(!rel){
				return false;
			}
		}
		
		for(int i = 0; i < length; i+=3){
			for(int j = 0; j < length; j+=3){
				rel = check(board, i, i+3, j, j+3);
				if(!rel){
					return false;
				}
			}
		}
        return true;
    }
	
	private boolean check (char[][] board, int sx, int ex, int sy, int ey){
		HashSet<Character> set = new HashSet<Character>();
		for(int i = sx; i < ex; i++){
			for(int j = sy; j < ey; j++){
				char ch = board[i][j];
				
				if(ch>='0' && ch <='9'){
					if(set.contains(ch)){
						return false;
					}else{
						set.add(ch);
					}
				}
			}
		}
		return true;
	}
}
