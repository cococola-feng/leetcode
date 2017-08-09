package set.a05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution051 {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> rel = new ArrayList<List<String>>();
		
		if(n < 1){
			return rel;
		}
        
		char[][] map = new char[n][n];
		for(char[] line : map){
			Arrays.fill(line, '.');
		}
		recall(map, 0, rel);
		
		return rel;
    }
	
	private void recall(char[][] map, int row, List<List<String>> rel){
		if(row >= map.length){
			List<String> list = new ArrayList<String>();
			for(char[] line : map){
				list.add(new String(line));
			}
			rel.add(list);
			return;
		}
		for(int i = 0; i < map[row].length; i++){
			map[row][i] = 'Q';
			if(detect(map, row, i)){
				recall(map, row + 1, rel);
			}
			map[row][i] = '.';
		}
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
