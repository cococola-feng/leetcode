package set.a22;

import java.util.ArrayList;
import java.util.List;

public class Solution229_Extend {
	// Print elements that appears more than 1/4 times
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> rel = new ArrayList<Integer>();
		
		if(nums == null || nums.length == 0) return rel;
		
		int count0 = 0, candidate0 = 0;
		int count1 = 0, candidate1 = 1;
		int count2 = 0, candidate2 = 2;
		
		for(int num : nums){
			if(num == candidate0){
				count0++;
			}else if(num == candidate1){
				count1++;
			}else if(num == candidate2){
				count2++;
			}else if(count0 == 0){
				candidate0 = num;
				count0++;
			}else if(count1 == 0){
				candidate1 = num;
				count1++;
			}else if(count2 == 0){
				candidate2 = num;
				count2++;
			}else{
				count0--;
				count1--;
				count2--;
			}
		}
		
		count0 = count1 = count2 = 0;
		for(int num : nums){
			if(num == candidate0) count0++;
			if(num == candidate1) count1++;
			if(num == candidate2) count2++;
		}
		
		if(count0 > nums.length / 4) rel.add(candidate0);
		if(candidate1 != candidate0 && count1 > nums.length / 4) rel.add(candidate1);
		if(candidate2 != candidate0 && candidate2 != candidate1 && count2 > nums.length / 4) rel.add(candidate2);
		
		return rel;
	}
}
