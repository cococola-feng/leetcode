package set.a05;

public class Solution059 {
	public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int value = 1;
        for(int i = 0; i < (n+1)/2; i++){
        	fill(matrix,i,i,n-1-2*i,value);
        	value += 4* (n-1-2*i);
        }
        return matrix;
    }
	
	private void fill (int[][] matrix, int x, int y, int len, int value){
		matrix[x][y] = value;
		
		for(int i = 0; i < len; i++){
			matrix[x][y + i] = value + i;
			matrix[x + i][y + len] = value + len + i;
			matrix[x + len][y + len - i] = value + 2 * len + i;
			matrix[x + len - i][y] = value + 3 * len + i;
		}
	}
}
