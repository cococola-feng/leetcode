package set.a04;

public class Solution042 {
	public int trap(int[] height) {
        int leftMax = 0;
        int maxIndex = -1;
        int index = 0;
        int trap = 0;
        int len = height.length;
        
        while (index < len) {
        	int tmp = height[index];
        	
        	if (tmp < leftMax){
        		trap += (leftMax - tmp);
        	}else if (tmp > leftMax) {
        		leftMax = tmp;
        		maxIndex = index;
        	}
        	
        	index++;
        }
        
        index = len - 1;
        int rightMax = 0;
        
        while (index > maxIndex) {
        	int tmp = height[index];
        	
        	if (tmp > rightMax){
        		rightMax = tmp;
        	}
        	
        	trap -= (leftMax - rightMax);
        	index--;
        }
        
        return trap;
    }
}
