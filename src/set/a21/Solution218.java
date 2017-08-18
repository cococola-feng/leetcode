package set.a21;

import java.util.ArrayList;
import java.util.List;

public class Solution218 {
	public List<int[]> getSkyline(int[][] buildings) {
		List<int[]> rel = new ArrayList<int[]>();
		if(buildings == null || buildings.length == 0) return rel;
		
        int left = Integer.MAX_VALUE, right = 0;
        
        for(int [] building : buildings){
        	left = Math.min(left, building[0]);
        	right = Math.max(right, building[1]);
        }
        
        int[] height = new int[right - left + 1];
        for(int [] building : buildings){
        	for(int i = building[0] - left; i < building[1] - left; i++){
        		height[i] = Math.max(height[i], building[2]);
        	}
        }
        
        int preHeight = height[0];
        rel.add(new int[]{left, height[0]});
        
        for(int i = 1; i < height.length - 1; i++){
        	if(height[i] != preHeight){
        		rel.add(new int[]{left + i, height[i]});
        		preHeight = height[i];
        	}
        }
        
        rel.add(new int[]{right, height[height.length - 1]});
        
        return rel;
    }
}
