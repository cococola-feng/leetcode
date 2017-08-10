package set.a19;

public class Solution200 {
	public int numIslands(char[][] grid) {
        int count = 0;
        if(grid == null || grid.length == 0) return count;
        
        int raws = grid.length;
        int cols = grid[0].length;
        
        for(int i = 0; i < raws; i++){
        	for(int j = 0; j < cols; j++){
        		if(grid[i][j] == '1'){
        			expand(grid, i, j, raws, cols, (char)('A' + (++count)));
        		}
        	}
        }
        
        return count;
    }
	
	private void expand(char[][] grid, int x, int y, int raws, int cols, char flag){
		if(x < 0 || x >= raws || y < 0 || y >= cols) return;
		
		if(grid[x][y] != '1') return;
		
		grid[x][y] = flag;
		
		expand(grid, x - 1, y, raws, cols, flag);
		expand(grid, x + 1, y, raws, cols, flag);
		expand(grid, x, y - 1, raws, cols, flag);
		expand(grid, x, y + 1, raws, cols, flag);
		
	}
}
