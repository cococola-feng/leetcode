package set.a04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution047 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length == 0){
			return rel;
		}
		
		boolean[] visited = new boolean[nums.length];
		Arrays.fill(visited, false);
		
		Arrays.sort(nums);
		recursivePermute(nums, visited, new ArrayList<Integer>(), rel);
		
		return rel;
    }
	
	private void recursivePermute(int[] nums, boolean[] visited, List<Integer> permutation, List<List<Integer>> rel){
		if(permutation.size() >= nums.length){
			rel.add(new ArrayList<Integer>(permutation));
			return;
		}
		
		for(int i = 0; i < nums.length; i++){
			if(visited[i]){
				continue;
			}
			
			if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]){
				continue;
			}
			
			visited[i] = true;
			permutation.add(nums[i]);
			recursivePermute(nums, visited, permutation, rel);
			permutation.remove(permutation.size() - 1);
			visited[i] = false;
			
		}
		
	}
}
