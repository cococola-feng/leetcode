package set.a13;

import java.util.Arrays;

public class Solution135 {
	public int candy(int[] ratings) {
        if(ratings.length == 0) return 0;
        int[] count = new int[ratings.length];
        Arrays.fill(count, 1);
        
        int sum = 0;
        for(int i = 1; i < ratings.length; i++) if(ratings[i] > ratings[i - 1]) count[i] = count[i - 1] + 1;
        for(int i = ratings.length - 1; i > 0; i--) if(ratings[i - 1] > ratings[i]) count[i - 1] = Math.max(count[i - 1], count[i] + 1);
        for(int i : count) sum += i;
        
        return sum;
    }
}
