package set.a06;

public class Solution062 {
	public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        
        map[0][0] = 1;
        
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(i > 0){
        			map[i][j] = map[i-1][j];
        		}
        		if(j > 0){
        			map[i][j] += map[i][j-1];
        		}
        	}
        }
        
        return map[m-1][n-1];
    }
}
