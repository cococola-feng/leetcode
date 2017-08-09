package set.a02;

public class Solution026 {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2){
			return nums.length;
		}
		
        int i = 1, j = 1;
        
        while (j < nums.length) {
        	while (j < nums.length && nums[j] == nums[j - 1]){
        		j++;
        	}
        	
        	if (j < nums.length) {
        		nums[i] = nums[j];
        		i++;
        		j++;
        	}
        }
        
        return i;
    }
}
