package set.a04;

public class Solution041 {
	/*Test Cases
	 * 1. [1, 1]
	 * 2. [1]
	 * 3. []
	 */
	public int firstMissingPositive(int[] nums) {
        int temp = 0;
        int len = nums.length;
        boolean changed = true;
        
        while(changed){
        	changed = false;
        	
	        for(int i = 0; i < len; i++){
	        	if(nums[i] <= 0 || nums[i] > len){
	        		continue;
	        	}
	        	
	        	if(nums[i] == (i + 1)){
	        		continue;
	        	}
	        	
	        	if(nums[nums[i] - 1] == nums[i]){
	        		continue;
	        	}
	        	
	        	changed = true;
	        	
	        	temp = nums[nums[i] - 1];
	        	nums[nums[i] - 1] = nums[i];
	        	nums[i] = temp;
	        }
        }
        
        for(int i = 0; i < len; i++){
        	if(nums[i] != (i+1)){
        		return (i+1);
        	}
        }
        
        return len + 1;
    }
}
