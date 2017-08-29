package set.a28;

public class Solution283 {
	public void moveZeroes(int[] nums) {
		if(nums == null || nums.length == 0) return;
		
		int index = 0, detector = 0;
		
		while(detector < nums.length){
			if(nums[detector] != 0){
				nums[index++] = nums[detector];
			}
			detector++;
		}
		
		while(index < nums.length){
			nums[index++] = 0;
		}
	}
}
