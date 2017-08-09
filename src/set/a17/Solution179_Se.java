package set.a17;

import java.util.Arrays;
import java.util.Comparator;

public class Solution179_Se {
	public String largestNumber(int[] num) {
		String[] numsStr = new String[num.length];
		for(int i = 0; i < num.length; i++) numsStr[i] = String.valueOf(num[i]);
		
		Arrays.sort(numsStr, new Comparator<String>() { 
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
		
		StringBuffer rel = new StringBuffer();
		for(String s : numsStr) rel.append(s);
		
		return rel.toString().replaceAll("^0+", "0");
	}
}
