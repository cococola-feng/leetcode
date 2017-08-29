package set.a26;

public class Solution268 {
	public int missingNumber(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for(int num : nums){
        	arr[num] = true;
        }
        
        int rel = -1;
        for(int i = 0; i < arr.length; i++){
        	if(!arr[i]){
        		rel = i;
        		break;
        	}
        }
        
        return rel;
    }
}
