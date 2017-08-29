package set.a28;

public class Solution283_Failed {
	// Disturb the sequence
	public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int left = 0, right = nums.length - 1;
        
        while(left < right){
        	while(left < right && nums[left] != 0) left++;
        	while(left < right && nums[right] == 0) right--;
        	
        	if(left >= right) break;
        	
        	int tmp = nums[left];
        	nums[left] = nums[right];
        	nums[right] = tmp;
        	left++;
        	right--;
        }
    }
}
