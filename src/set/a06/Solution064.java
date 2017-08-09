package set.a06;

public class Solution064 {
	public int minPathSum(int[][] grid) {
		if(grid == null || grid.length == 0 || grid[0].length == 0){
        	return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] map = new int[m][n];
        
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		map[i][j] = grid[i][j];
        		if(i > 0){
        			if(j > 0){
        				map[i][j] += Math.min(map[i-1][j], map[i][j-1]);
        			}else{
        				map[i][j] += map[i-1][j];
        			}
        		}else{
        			if(j > 0){
        				map[i][j] += map[i][j-1];
        			}
        		}
        	}
        }
        
        return map[m-1][n-1];
    }
}
