package set.a04;

import java.util.Arrays;

public class Solution045 {
	public int jump(int[] nums) {
		int endofNextStep = 0;
		int endofThisStep = 0;
		int steps = 0;
		//Think about why the limits of i is 'nums.length -1'
		for(int i = 0; i < nums.length - 1; i++){
			endofNextStep = Math.max(endofNextStep, i + nums[i]);
			//if reach the 'end of this step', step++ and reset the 'end of this step'
			if(i == endofThisStep){
				steps++;
				endofThisStep = endofNextStep;
			}
		}
		
		return steps;
	}
}
