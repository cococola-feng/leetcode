package set.a01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution015 {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> relList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
        	if ( i == 0 || nums[i] != nums[i-1]){
        		int s = i + 1, t = nums.length - 1;
        		while ( s < t ){
        			if( nums[i] + nums[s] + nums[t] == 0 ){
        				List<Integer> elem = new ArrayList<Integer>();
        				elem.add(nums[i]);
        				elem.add(nums[s]);
        				elem.add(nums[t]);
        				relList.add(elem);
        				while ( s < t && nums[s] == nums[s+1]){
        					s++;
        				}
        				s++;
        				while ( s < t && nums[t] == nums[t-1]){
        					t--;
        				}
        				t--;
        			}else if ( nums[i] + nums[s] + nums[t] < 0){
        				s++;
        			}else{
        				t--;
        			}
        		}
        	}
        }
        
        return relList;
    }
}
