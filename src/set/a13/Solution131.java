package set.a13;

import java.util.ArrayList;
import java.util.List;

public class Solution131 {
	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		if (s == null || s.length() == 0)
			return res;

		List<String> combination = new ArrayList<String>();
		for (char c : s.toCharArray()) {
			combination.add(String.valueOf(c));
		}

		combine(combination, 0, res);

		return res;
	}

	private void combine(List<String> combination, int start, List<List<String>> res) {
		res.add(combination);

		for (int i = start; i < combination.size(); i++) {
			if (combination.get(i).length() == 1 && i > 0 && combination.get(i).equals(combination.get(i - 1))) {
				List<String> copy = new ArrayList<String>(combination);
				String newElem = copy.get(i - 1) + copy.get(i);
				copy.remove(i);
				copy.remove(i - 1);
				copy.add(i - 1, newElem);
				combine(copy, i - 1, res);
			}
			if (i > 0 && i + 1 < combination.size() && combination.get(i - 1).equals(combination.get(i + 1))) {
				List<String> copy = new ArrayList<String>(combination);
				String newElem = copy.get(i - 1) + copy.get(i) + copy.get(i + 1);
				copy.remove(i + 1);
				copy.remove(i);
				copy.remove(i - 1);
				copy.add(i - 1, newElem);
				combine(copy, i - 1, res);
			}
		}
	}
}
