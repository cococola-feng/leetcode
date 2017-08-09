package set.a05;

import java.util.Arrays;

public class Solution052 {
	public int totalNQueens(int n) {
		if(n < 1){
			return 0;
		}
        
		char[][] map = new char[n][n];
		for(char[] line : map){
			Arrays.fill(line, '.');
		}
		return recall(map, 0);
    }
	
	private int recall(char[][] map, int row){
		if(row >= map.length){
			return 1;
		}
		
		int count = 0;
		for(int i = 0; i < map[row].length; i++){
			map[row][i] = 'Q';
			if(detect(map, row, i)){
				count += recall(map, row + 1);
			}
			map[row][i] = '.';
		}
		
		return count;
	}
	
	private boolean detect(char[][]map, int x, int y){
		return detectCol(map, y) && detectLine(map, x, y);
	}
	private boolean detectCol(char[][] map, int col){
		int count = 0;
		
		for(int i = 0; i < map.length; i++){
			if(map[i][col] == 'Q'){
				count++;
			}
		}
		
		return count < 2;
	}
	
	private boolean detectLine(char[][] map, int x, int y){
		int i = x;
		int j = y;
		
		while (--i >= 0 && --j >= 0){
			if(map[i][j] == 'Q'){
				return false;
			}
		}
		
		i = x;
		j = y;
		while (++i < map.length && ++j < map[i].length){
			if(map[i][j] == 'Q'){
				return false;
			}
		}
		
		i = x;
		j = y;
		while (--i >= 0 && ++j < map[i].length){
			if(map[i][j] == 'Q'){
				return false;
			}
		}
		
		i = x;
		j = y;
		while (++i < map.length && --j >= 0){
			if(map[i][j] == 'Q'){
				return false;
			}
		}
		
		
		return true;
	}
}
