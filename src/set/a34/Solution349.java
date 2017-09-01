package set.a34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        
        for(int num : nums1){
        	nums1Set.add(num);
        }
        
        for(int num : nums2){
        	if(nums1Set.contains(num)){
        		resList.add(num);
        		nums1Set.remove(num);
        	}
        }
        
        int[] res = new int[resList.size()];
        for(int i = 0; i < resList.size(); i++){
        	res[i] = resList.get(i);
        }
        
        return res;
    }
}
