package set.a04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution046_SWAP {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length == 0){
			return rel;
		}
		
		recursivePermute(nums, 0, rel);
		
		return rel;
    }
	
	private void recursivePermute(int[] nums, int begin, List<List<Integer>> rel){
		if(begin >= nums.length){
			List<Integer> copy = copyFrom(nums);
			rel.add(copy);
			return;
		}
		
		for(int i = begin; i < nums.length; i++){
			if(i != begin && nums[i] == nums[begin]){
				continue;
			}
			swap(nums, begin, i);
			recursivePermute(nums, begin + 1, rel);
			swap(nums, begin, i);
		}
	}
	
	private void swap (int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private List<Integer> copyFrom (int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i : nums){
			list.add(i);
		}
		return list;
	}
	
}
