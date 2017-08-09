package set.a04;

public class Solution048 {
	public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return;
        }
        
        int len = matrix.length;
        
        for(int i = 0; i < len; i++){
        	for(int j = 0; j < len/2; j++){
        		swap(matrix, i, j, i, len -1 - j);
        	}
        }
        
        for(int i = 0; i < len; i++){
        	for(int j = 0; j < len - i; j++){
        		swap(matrix, i, j, len - 1 - j, len - 1 - i);
        	}
        }
    }
	
	private void swap(int[][] matrix, int x1, int y1, int x2, int y2){
		int temp = matrix[x1][y1];
		matrix[x1][y1] = matrix[x2][y2];
		matrix[x2][y2] = temp;
	}
}
