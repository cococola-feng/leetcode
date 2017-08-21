package set.a22;

import java.util.ArrayList;
import java.util.List;

public class Solution228 {
	public List<String> summaryRanges(int[] nums) {
		List<String> relList = new ArrayList<String>();
		if(nums == null || nums.length == 0) return relList;
		
		int start = nums[0];
		
		for(int i = 0; i < nums.length - 1; i++){
			if(nums[i+1] != nums[i] + 1){
				if(start == nums[i]){
					relList.add(""+start);
				}else{
					relList.add(start + "->" + nums[i]);
				}
				start = nums[i + 1];
			}
		}
		if(start == nums[nums.length - 1]){
			relList.add(""+start);
		}else{
			relList.add(start + "->" + nums[nums.length - 1]);
		}
        
		return relList;
    }
}
