package set.a20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] visited = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> required = new HashMap<Integer, List<Integer>>();
        
        for(int[] depends : prerequisites){
        	if(!map.containsKey(depends[1])){
        		map.put(depends[1], new ArrayList<Integer>());
        	}
        	map.get(depends[1]).add(depends[0]);
        	
        	if(!required.containsKey(depends[0])){
        		required.put(depends[0], new ArrayList<Integer>());
        	}
        	required.get(depends[0]).add(depends[1]);
        }
        
        boolean canFinish = true;
        for(int i = 0; i < numCourses; i++){
        	if(!dfs(i, map, visited)){
        		canFinish = false;
        		break;
        	}
        }
        
        int[] rel = new int[0];
        
        if(canFinish){
        	rel = new int[numCourses];
        	int relIndex = 0;
        	Arrays.fill(visited, 0);
        	Queue<Integer> queue = new LinkedList<Integer>();
        	
        	for(int i = 0; i < numCourses; i++){
        		if(!required.containsKey(i)){
        			queue.add(i);
        			visited[i] = -1;
        		}
        	}
        	
        	while(!queue.isEmpty()){
        		int course = queue.poll();
        		
        		boolean completed = true;
        		if(required.containsKey(course)){
        			for(int preCourse : required.get(course)){
        				if(visited[preCourse] != 1){
        					completed = false;
        					break;
        				}
        			}
        		}
        		
        		if(completed){
        			visited[course] = 1;
        			rel[relIndex++] = course;
        			if(map.containsKey(course)){
	        			for(int nextCourse : map.get(course)){
	        				if(visited[nextCourse] == 0){
	        					queue.add(nextCourse);
	        					visited[nextCourse] = -1;
	        				}
	        			}
        			}
        		}else{
        			queue.add(course);
        		}
        	}
        }
        
        return rel;
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
