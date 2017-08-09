package star;

public class Solution154 {
	public int findMin(int[] nums) {
		int left = 0, right = nums.length - 1, mid = 0;
		
		while(left < right){
			mid = (left + right) / 2;
			
			if(nums[mid] == nums[right]){
				right--;
			}else if(nums[mid] > nums[right]){
				left = mid + 1;
			}else{
				right = mid;
			}
		}
		
		return nums[left];
	}
}
