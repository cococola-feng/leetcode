package set.a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution126 {
	public List<List<String>> findLadders(String start, String end, List<String> wordList) {
		List<List<String>> rel = new ArrayList<List<String>>();

		Set<String> dict = new HashSet<String>(wordList);
		dict.add(start);
		Map<String, List<String>> neighbors = getNeighbors(dict);
		Map<String, Integer> distance = getDistance(start, end, neighbors);
		List<String> path = new ArrayList<String>();
		path.add(start);
		dfs(start, end, neighbors, distance, 0, path, rel);
		
		return rel;
	}

	private Map<String, List<String>> getNeighbors(Set<String> dict) {
		Map<String, List<String>> neighbors = new HashMap<String, List<String>>();
		for (String str : dict) {
			List<String> neighbor = new ArrayList<String>();
			char[] characters = str.toCharArray();
			for (int i = 0; i < characters.length; i++) {
				for (char ch = 'a'; ch <= 'z'; ch++) {
					if (ch == characters[i])
						continue;
					char[] copy = Arrays.copyOf(characters, characters.length);
					copy[i] = ch;
					if (dict.contains(String.valueOf(copy))) {
						neighbor.add(String.valueOf(copy));
					}
				}
			}
			neighbors.put(str, neighbor);
		}
		return neighbors;
	}

	private Map<String, Integer> getDistance(String start, String end, Map<String, List<String>> neighbors) {
		Map<String, Integer> distanceMap = new HashMap<String, Integer>();
		Queue<String> queue = new LinkedList<String>();
		queue.add(start);
		queue.add("");

		int curDistance = 0;

		while (!queue.isEmpty()) {
			String elem = queue.poll();
			if (elem.equals("")) {
				curDistance++;
				if (!queue.isEmpty())
					queue.add(elem);
				continue;
			}

			if (distanceMap.containsKey(elem)) {
				continue;
			}

			distanceMap.put(elem, curDistance);
			List<String> neighbor = neighbors.get(elem);
			for (String neighborElem : neighbor) {
				queue.add(neighborElem);
			}
		}

		return distanceMap;
	}

	private void dfs(String node, String end, Map<String, List<String>> neighbors, Map<String, Integer> distance,
			int dis, List<String> path, List<List<String>> rel) {
			if(dis > distance.get(node)){
				return;
			}
			
			if(node.equals(end)){
				rel.add(new ArrayList<String>(path));
				return;
			}
			
			List<String> neighbor = neighbors.get(node);
			for(String elem: neighbor){
				path.add(elem);
				dfs(elem, end, neighbors, distance, dis + 1, path, rel);
				path.remove(path.size() - 1);
			}
			
	}
}
