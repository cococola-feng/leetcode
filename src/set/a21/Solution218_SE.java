package set.a21;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution218_SE {
	// I forget how to process with the beginning in this function. This is not finished.
	public List<int[]> getSkyline(int[][] buildings) {
		List<int[]> rel = new ArrayList<int[]>();
		if(buildings == null || buildings.length == 0) return rel;
		
		Stack<int[]> stack = new Stack<int[]>();
		
		rel.add(new int[]{buildings[0][0], buildings[0][2]});
		int preHeight = buildings[0][2];
		int preRight = buildings[0][1];
		
		for(int i = 1; i < buildings.length; i++){
			//Check whether it's needed to add a new coordinate
			if(buildings[i][2] != preHeight){
				rel.add(new int[]{buildings[i][0], buildings[i][2]});
			}
			
			int height = buildings[i][2];
			int right = buildings[i][1];
			
			if(height >= preHeight && right >= preRight){
				preHeight = height;
				preRight = right;
			}else if(height > preHeight && right < preRight){
				stack.add(new int[]{preRight, preHeight});
				preHeight = height;
				preRight = right;
			}else if(height < preHeight && right > preRight){
				stack.add(new int[]{right, height});
			}
			
		}
		
		return rel;
	}
}
