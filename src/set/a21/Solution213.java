package set.a21;

public class Solution213 {
	public int rob(int[] nums) {
		if(nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length -2), rob(nums, 1, nums.length - 1));
    }
	
	private int rob(int[] nums, int start, int end){
		int a = 0, b = 0;
        
        for(int i = start; i <= end; i++){
        	if(i % 2 == 0){
        		a = Math.max(a + nums[i], b);  //robbed the first
        	}else{
        		b = Math.max(b + nums[i], a); 
        	}
        }
        
        return Math.max(a, b);
	}
}
