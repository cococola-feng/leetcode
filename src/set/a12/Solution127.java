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

public class Solution127 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> dict = new HashSet<String>(wordList);
		dict.add(beginWord);
		Map<String, List<String>> neighbors = getNeighbors(dict);
		return getDistance(beginWord, endWord, neighbors);
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
	
	private int getDistance(String start, String end, Map<String, List<String>> neighbors) {
		Set<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		queue.add(start);
		queue.add("");

		int curDistance = 1;

		while (!queue.isEmpty()) {
			String elem = queue.poll();
			if(elem.equals(end)){
				return curDistance;
			}
			
			if (elem.equals("")) {
				curDistance++;
				if (!queue.isEmpty())
					queue.add(elem);
				continue;
			}

			if (visited.contains(elem)) {
				continue;
			}

			visited.add(elem);
			List<String> neighbor = neighbors.get(elem);
			for (String neighborElem : neighbor) {
				queue.add(neighborElem);
			}
		}

		return 0;
	}
}
