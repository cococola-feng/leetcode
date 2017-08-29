package set.a28;

import java.util.ArrayList;
import java.util.List;

public class Solution282 {
	public List<String> addOperators(String num, int target) {
		List<String> res = new ArrayList<String>();
		if (num == null || num.length() == 0)
			return res;
		compute(num, target, "", res, 0, 0, 0);
		return res;
	}

	private void compute(String num, int target, String path, List<String> res, int index, long eval, long multiplied) {
		if (index == num.length()) {
			if (eval == target) {
				res.add(path);
			}
			return;
		}

		for (int i = index; i < num.length(); i++) {
			long curNum = Long.parseLong(num.substring(index, i + 1));

			if (index == 0) {
				compute(num, target, path + curNum, res, i + 1, curNum, curNum);
			} else {
				compute(num, target, path + "+" + curNum, res, i + 1, eval + curNum, curNum);
				compute(num, target, path + "-" + curNum, res, i + 1, eval - curNum, -curNum);
				compute(num, target, path + "*" + curNum, res, i + 1, eval - multiplied + multiplied * curNum, multiplied * curNum);
			}
			
			if (num.charAt(index) == '0') break;
		}
	}
}
