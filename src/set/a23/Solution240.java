package set.a23;

public class Solution240 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int raws = 0;
        int cols = matrix[0].length - 1;
        
        while(raws < matrix.length && cols >= 0){
        	int num = matrix[raws][cols];
        	if(num == target){
        		return true;
        	}else if(num < target){
        		raws++;
        	}else{
        		cols--;
        	}
        }
        return false;
	}
}
