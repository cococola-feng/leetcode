package set.a04;

import java.util.ArrayList;
import java.util.List;

public class Solution046 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
        
        if(nums == null || nums.length == 0){
        	return rel;
        }
        
        List<Integer> bag = new ArrayList<Integer>();
        for(int i : nums){
        	bag.add(i);
        }
        
        recursivePermute(bag, new ArrayList<Integer>(), rel);
        
        return rel;
    }
	
	private void recursivePermute (List<Integer> bag, List<Integer> permutation, List<List<Integer>> rel) {
		if(bag.size() == 0){
			List<Integer> copy = new ArrayList<Integer>(permutation);
			rel.add(copy);
			return;
		}
		
		for(int i = 0; i < bag.size(); i++){
			permutation.add(bag.get(i));
			List<Integer> newBag = new ArrayList<Integer>(bag);
			newBag.remove(i);
			recursivePermute(newBag, permutation, rel);
			permutation.remove(permutation.size() - 1);
		}
	}
}
