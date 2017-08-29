package set.a23;

public class Solution240_Failed {
	//This problem cannot be solved by O(log(m) + log(n))
	
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int raws = matrix.length;
        int cols = matrix[0].length;
        
        int top = 0, bottom = raws - 1;
        
        while(top < bottom){
        	int mid = (top + bottom) / 2;
        	if(matrix[mid][0] == target){
        		return true;
        	}else if(matrix[mid][0] > target){
        		bottom = mid - 1;
        	}else{
        		top = mid;
        	}
        	
        	if(top + 1 == bottom){
        		break;
        	}
        }
        int left = 0, right = cols - 1;
        while(left < right){
        	int mid = (left + right) / 2;
        	if(matrix[top][mid] == target){
        		return true;
        	}else if(matrix[top][mid] > target){
        		left = mid + 1;
        	}else{
        		right = mid - 1;
        	}
        }
        
        return false;
    }
}
