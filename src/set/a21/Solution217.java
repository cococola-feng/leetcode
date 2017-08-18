package set.a21;

import java.util.HashSet;
import java.util.Set;

public class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
        for(int num : nums)
        	if(!set.add(num))  return true;
        return false;
    }
}