package set.a21;

public class Solution220 {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums == null || nums.length == 0 || k == 0) return false;
        
        for(int i = 0; i < nums.length; i++){
        	for(int j = 1; j <= k && i - j >= 0; j++){
        		long gap = (long)nums[i] - (long)nums[i - j];
        		gap = gap >= 0 ? gap : -gap;
        		if(gap > (long)Integer.MAX_VALUE){
        			continue;
        		}
        		if(gap <= t){
        			return true;
        		}
        	}
        }
        
        return false;
    }
}
