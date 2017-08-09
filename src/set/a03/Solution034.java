package set.a03;

public class Solution034 {
	public int[] searchRange(int[] nums, int target) {
        int[] rel = new int[]{-1, -1};
        int index = 0;
        
        while (index < nums.length){
        	if(nums[index] == target) {
        		rel[0] = index;
        		break;
        	}
        	index++;
        }
        while (index < nums.length){
        	if(nums[index] == target) {
        		rel[1] = index;
        	}else{
        		break;
        	}
        	index++;
        }
        
        return rel;
    }
}
