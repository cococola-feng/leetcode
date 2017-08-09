package set.a02;

public class Solution027 {
	public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        
        while (j < nums.length) {
        	while (i < nums.length && nums[i] != val) {
        		i++;
        	}
        	
        	j = i + 1;
        	
        	while (j < nums.length && nums[j] == val) {
        		j++;
        	}
        	
        	if (j >= nums.length) {
        		break;
        	}
        	
        	nums[i] = nums[j];
        	nums[j] = val;
        	i++;
        }
        
        return i;
    }
}
