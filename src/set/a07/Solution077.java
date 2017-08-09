package set.a07;

import java.util.ArrayList;
import java.util.List;

public class Solution077 {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        
        if(n <= 0 || k <= 0){
        	return rel;
        }
        
        List<Integer> bag = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
        	bag.add(i);
        }
        
        recursiveCombine(bag, 0, new ArrayList<Integer>(), k, rel);
        return rel;
    }
	
	private void recursiveCombine (List<Integer> bag, int bagIndex, List<Integer> combination, int k, List<List<Integer>> rel){
		if(k == 0){
			rel.add(new ArrayList<Integer>(combination));
			return;
		}
		
		while(bagIndex < bag.size()){
			combination.add(bag.get(bagIndex));
			recursiveCombine(bag, bagIndex + 1, combination, k - 1, rel);
			combination.remove(combination.size() - 1);
			bagIndex++;
		}
	}
}
