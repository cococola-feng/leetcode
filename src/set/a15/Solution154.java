package set.a15;

public class Solution154 {
	public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        if(nums == null || nums.length == 0){
        	return -1;
        }
        
        if(nums.length == 1){
        	return nums[0];
        }
        
        int min = Integer.MAX_VALUE;
        
        while(left <= right){
        	int mid = (left + right) / 2;
        	
        	if(mid == 0){
        		if(nums[mid] > nums[mid + 1]){
        			min = nums[mid + 1];
        			break;
        		}else{
        			min =  nums[mid];
        			break;
        		}
        	}
        	
        	if(mid == nums.length -1){
        		if(nums[mid] > nums[mid - 1]){
        			min =  nums[0];
        			break;
        		}else{
        			min =  nums[mid];
        			break;
        		}
        	}
        	
        	if(nums[mid] <= nums[mid - 1] && nums[mid] <= nums[mid + 1]){
        		min =  nums[mid];
        		break;
        	}
        	
        	if(nums[mid] >= nums[left] && nums[mid] > nums[right]){
        		left = mid + 1;
        	}else if(nums[mid] < nums[left] && nums[mid] < nums[right]){
        		right = mid - 1;
        	}else if(nums[mid] > nums[left] && nums[mid] <= nums[right]){
        		right = mid - 1;
        	}else if(nums[mid] == nums[left] && nums[mid] == nums[right]){
        		left = mid + 1;
        	}
        }
        
        return min;
    }
}
