package set.a03;

public class Solution035 {
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rel = 0;
        
        while (left <= right) {
        	int mid = (left + right)/2;
        	
        	if(nums[mid] == target) {
        		rel = mid;
        		break;
        	}else if(target > nums[mid]) {
        		left = mid + 1;
        	}else{
        		right = mid - 1;
        	}
        }
        
        if(left > right){
        	rel = right + 1;
        }
        
        return rel;
    }
}
