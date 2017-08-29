package set.a28;

public class Solution287 {
	public int findDuplicate(int[] nums) {
		if(nums == null || nums.length <= 1) return -1;
		
		int fast = nums[nums[0]], slow = nums[0];
		
		while(fast != slow){
			fast = nums[nums[fast]];
			slow = nums[slow];
		}
		
		fast = 0;
		
		while(fast != slow){
			fast = nums[fast];
			slow = nums[slow];
		}
		
		return slow;
    }
}
