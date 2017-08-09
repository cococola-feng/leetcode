package set.a08;

import java.util.Arrays;

public class Solution085 {
	public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0){
        	return 0;
        }
        
        int raws = matrix.length;
        int cols = matrix[0].length;
        
        int[] leftBorder = new int[cols];
        int[] rightBorder = new int[cols];
        int[] heights = new int[cols];
        Arrays.fill(leftBorder, 0);
        Arrays.fill(rightBorder, cols);
        Arrays.fill(heights, 0);
        
        int maxArea = 0;
        
        for(int i = 0; i < raws; i++){
        	int curLeft = 0;
        	for(int j = 0; j < cols; j++){
        		if(matrix[i][j] == '1'){
        			leftBorder[j] = Math.max(leftBorder[j], curLeft);
        		}else{
        			leftBorder[j] = 0;
        			curLeft = j + 1;
        		}
        	}
        	
        	int curRight = cols;
        	for(int j = cols - 1; j >= 0; j--){
        		if(matrix[i][j] == '1'){
        			rightBorder[j] = Math.min(rightBorder[j], curRight);
        		}else{
        			rightBorder[j] = cols;
        			curRight = j;
        		}
        	}
        	
        	for(int j = 0; j < cols; j++){
        		if(matrix[i][j] == '1'){
        			heights[j]++;
        		}else{
        			heights[j] = 0;
        		}
        	}
        	
        	for(int j = 0; j < cols; j++){
        		maxArea = Math.max(maxArea, (rightBorder[j] - leftBorder[j]) * heights[j]);
        	}
        }
        
        return maxArea;
    }
}
