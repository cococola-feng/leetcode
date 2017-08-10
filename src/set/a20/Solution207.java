package set.a20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution207 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        
        for(int[] depends : prerequisites){
        	if(map.containsKey(depends[0])){
        		map.get(depends[0]).add(depends[1]);
        	}else{
        		List<Integer> arcs = new ArrayList<Integer>();
        		arcs.add(depends[1]);
        		map.put(depends[0], arcs);
        	}
        }
        
        for(int i = 0; i < numCourses; i++){
        	if(!dfs(i, map, visited)){
        		return false;
        	}
        }
        
        return true;
    }
	
	private boolean dfs(int i, Map<Integer, List<Integer>> map, int[] visited){
		if(visited[i] == -1){
			return false;
		}
		
		if(visited[i] == 1){
			return true;
		}
		
		visited[i] = -1;
		
		if(map.containsKey(i)){
			for(int j : map.get(i)){
				if(!dfs(j, map, visited)){
					return false;
				}
			}
		}
		
		visited[i] = 1;
		
		return true;
	}
}
