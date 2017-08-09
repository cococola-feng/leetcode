package set.a08;

import java.util.Stack;

public class Solution084 {
	public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        
        int index = 0;
        while(index <= heights.length){
        	int h = index == heights.length ? 0 : heights[index];
        	if(stack.isEmpty() || h >= heights[stack.peek()]){
        		stack.push(index);
        		index++;
        	}else{
        		int l = stack.pop();
        		int w = stack.isEmpty() ? index : index - 1 - stack.peek();
        		maxArea = Math.max(maxArea, w * heights[l]);
        	}
        }
        
        return maxArea;
    }
}
