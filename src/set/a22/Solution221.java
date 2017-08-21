package set.a22;

public class Solution221 {
	public int maximalSquare(char[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
		
		int raws = matrix.length, cols = matrix[0].length;
		
        int[][] area = new int[raws+1][cols+1];
        
        int max = 0;
        
        for(int i = 1; i <= raws; i++){
        	for(int j = 1; j <= cols; j++){
        		area[i][j] = matrix[i - 1][j - 1] == '0' ? 0 : Math.min(Math.min(area[i - 1][j], area[i][j - 1]), area[i - 1][j - 1]) + 1;
        		max = Math.max(area[i][j], max);
        	}
        }
        
        return max * max;
    }
}
