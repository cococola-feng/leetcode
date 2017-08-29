package set.a27;

import java.util.Arrays;

public class Solution279 {
	public int numSquares(int n) {
        int[] countArray = new int[n + 1];
        Arrays.fill(countArray, Integer.MAX_VALUE);
        countArray[0] = 0;
        
        for(int i = 1; i <= n; i++){
        	for(int j = 1; j * j <= i; j++){
        		countArray[i] = Math.min(countArray[i], countArray[i - j * j] + 1);
        	}
        }
        
        return countArray[n];
    }
	
	
}
