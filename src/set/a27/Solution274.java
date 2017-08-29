package set.a27;

import java.util.Arrays;

public class Solution274 {
	public int hIndex(int[] citations) {
		int maxIndex = 0;
        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0; i--){
        	if(i > 0 && citations[i - 1] == citations[i]) continue;
        	
        	int hIndex = Math.min(citations.length - i, citations[i]);
        	maxIndex = Math.max(hIndex, maxIndex);
        }
        return maxIndex;
    }
}
