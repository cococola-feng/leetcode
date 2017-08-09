package set.a13;

import java.util.ArrayList;
import java.util.List;

public class Solution132 {
	public int minCut(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        
        int[] count = new int[len];
        boolean[][] isPalindrome = new boolean[len][len];
        
        for(int i = 0; i < len; i++){
        	int min = i;
        	for(int j = 0; j < i; j ++){
        		if(charArray[i] == charArray[j] && (j + 1 > i - 1 || isPalindrome[j+1][i-1])){
        			isPalindrome[j][i] = true;
        			min = j == 0 ? 0 : Math.min(min, count[j - 1] + 1);
        		}
        	}
        	count[i] = min;
        }
        return count[len - 1];
    }
	
}
