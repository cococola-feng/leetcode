package set.a26;

public class Solution268_SE {
	public int missingNumber(int[] nums) {
		int rel = -1;
		for(int i = 0; i < nums.length; i++){
			if(i == nums[i]) continue;
			
			if(nums[i] < nums.length){
				int tmp = nums[nums[i]];
				nums[nums[i]] = nums[i];
				nums[i] = tmp;
				i--;
			}
		}
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != i){
				rel = i;
				break;
			}
		}
		
		return rel == -1 ? nums.length : rel;
	}
}
