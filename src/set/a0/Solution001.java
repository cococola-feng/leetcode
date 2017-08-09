package set.a0;

public class Solution001 {
	public int[] twoSum(int[] nums, int target) {
		int[] rel = new int[2];
		
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					rel[0] = i;
					rel[1] = j;
					return rel;
				}
			}
		}
		

		return rel;
	}
}
