package set.a07;

import java.util.Arrays;

public class Solution074 {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return false;
        }
        
        int index = matrix.length - 1;
        while(index >= 0){
        	if(target >= matrix[index][0]){
        		break;
        	}
        	index--;
        }
        
        if(index < 0){
            return false;
        }else{
            return Arrays.binarySearch(matrix[index], target) >= 0;
        }
    }
}
