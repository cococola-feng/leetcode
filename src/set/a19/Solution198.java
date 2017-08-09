package set.a19;

public class Solution198 {
	public int rob(int[] nums) {
        int a = 0, b = 0;
        
        for(int i = 0; i < nums.length; i++){
        	if(i % 2 == 0){
        		a = Math.max(a + nums[i], b);
        	}else{
        		b = Math.max(b + nums[i], a);
        	}
        }
        
        return Math.max(a, b);
    }
}
