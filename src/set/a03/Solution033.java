package set.a03;

public class Solution033 {
	public int search(int[] nums, int target) {
		int rel = -1;
		
		if (nums == null || nums.length == 0) {
			return rel;
		}
		
		int base = split(nums);
		int length = nums.length;
		if (base >= 0) {
			int left = 0;
			int right = length - 1;
			
			if (base == 0){
				
			}else if (target >= nums[0]){
				right = base - 1;
			}else{
				left = base;
			}
			
			while (left <= right) {
				int mid = (left + right)/2;
				if(nums[mid] == target){
					rel = mid;
					break;
				}else if(nums[mid] > target) {
					right = mid - 1;
				}else{
					left = mid + 1;
				}
			}
		}
		
		return rel;
	}
	
	private int split(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		
		int rel = -1;
		
		while (left <= right) {
			int mid = (left + right)/2;
			if(left == right){
				return mid;
			}
			if(mid == 0){
				if(nums[0] < nums[1]){
					return 0;
				}else{
					left = mid + 1;
				}
			}
			else if(nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]){
				return mid;
			}
			else if(nums[mid] >= nums[left] && nums[mid] < nums[right]){
				right = mid - 1;
			}
			else if(nums[mid] >= nums[left] && nums[mid] > nums[right]){
				left = mid + 1;
			}
			else if(nums[mid] <= nums[left] && nums[mid] < nums[right]){
				right = mid - 1;
			}
		}
		
		return rel;
	}
	private int getSplitPoint(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int rel = -1;
		
		if (nums.length == 1){
			return 0;
		}

		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (mid > 0 && mid < nums.length - 1 && nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
				rel = mid;
				break;
			}
			
			if (mid == 0) {
				rel = nums[0] < nums[1] ? 0 : 1;
				break;
			}
			
			if (nums[mid] > nums[left]) {
				if (nums[mid] > nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {
				if (nums[mid] < nums[right]) {
					if (mid > 0 && mid < nums.length - 1 && nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
						rel = mid;
						break;
					}else{
						right = mid - 1;
					}
				} else {
					break;
				}
			}
		}
		
		return rel;
	}
}
