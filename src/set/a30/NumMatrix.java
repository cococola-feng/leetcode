package set.a30;

public class NumMatrix {
	
	private int[][] sumMatrix = null;
	
	public NumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return;
        }
        
        sumMatrix = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < sumMatrix.length; i++){
        	for(int j = 0; j < sumMatrix[0].length; j++){
        		sumMatrix[i][j] = matrix[i][j] + getSum(i - 1, j) + getSum(i, j - 1) - getSum(i - 1, j - 1);
        	}
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return getSum(row2, col2) - getSum(row1 - 1, col2) - getSum(row2, col1 - 1) + getSum(row1 - 1, col1 - 1);
    }
    
    private int getSum(int x, int y){
    	if(x < 0 || y < 0){
    		return 0;
    	}
    	
    	if(sumMatrix == null){
    		return 0;
    	}
    	
    	x = x < sumMatrix.length ? x : sumMatrix.length - 1;
    	y = y < sumMatrix[0].length ? y : sumMatrix[0].length - 1;
    	
    	return sumMatrix[x][y];
    }
}
