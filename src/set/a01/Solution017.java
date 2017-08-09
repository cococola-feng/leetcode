package set.a01;

import java.util.ArrayList;
import java.util.List;

public class Solution017 {
	List<String> list = new ArrayList<String>();
	public List<String> letterCombinations(String digits) {
		if(digits == null || digits.length() == 0){
			return list;
		}
        char[] digitsArray = digits.toCharArray();
        combine("", digitsArray, 0);
        return list;
    }
	
	private void combine (String prefix, char[] array, int index){
		char[] tempCharArray = getChar(array[index]);
		for(char c : tempCharArray){
			String s = prefix + c;
			if(index == array.length - 1){
				list.add(s);
			}else{
				combine (s, array, index + 1);
			}
		}
	}
	private char[] getChar (char c){
		if(c < '2' || c > '9'){
			return new char[]{};
		}
		if(c == '9'){
			return new char[]{'w', 'x', 'y','z'};
		}else if( c == '8'){
			return new char[]{'t', 'u','v'};
		}else if( c == '7'){
			return new char[]{'p', 'q', 'r','s'};
		}else{
			char[] rel = new char[3];
			int begin = 3 * (c - '2');
			for(int index = 0; index < 3; index ++){
				rel[index] = (char) ('a' + index + begin);
			}
			return rel;
		}
	}
}
