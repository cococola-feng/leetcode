package set.a05;

import java.util.ArrayList;
import java.util.List;

public class Solution054 {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return list;
        }
        
        int left = -1;
        int right = matrix[0].length;
        int top = -1;
        int bottom = matrix.length;
        
        int x = 0;
        int y = 0;
        
        boolean remains = true;
        
        while(remains){
        	remains = false;
        	while(x > top && x < bottom && y > left && y < right){
        		list.add(matrix[x][y]);
        		y++;
        		remains = true;
        	}
        	y--;
        	x++;
        	top++;
        	
        	while(x > top && x < bottom && y > left && y < right){
        		list.add(matrix[x][y]);
        		x++;
        		remains = true;
        	}
        	x--;
        	y--;
        	right--;
        	
        	while(x > top && x < bottom && y > left && y < right){
        		list.add(matrix[x][y]);
        		y--;
        		remains = true;
        	}
        	y++;
        	x--;
        	bottom--;
        	
        	while(x > top && x < bottom && y > left && y < right){
        		list.add(matrix[x][y]);
        		x--;
        		remains = true;
        	}
        	x++;
        	y++;
        	left++;
        }
        
        return list;
    }
}
