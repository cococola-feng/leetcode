package set.a26;

public class Solution264 {
	public int nthUglyNumber(int n) {
        if(n < 6) return n;
        
        int[] arr = new int[n + 1];
        for(int i = 1; i <= 5; i++) arr[i] = i;
        
        int index2 = 2, index3 = 2, index5 = 2;
        
        for(int i = 6; i <= n; i++){
        	while(2 * arr[index2] <= arr[i - 1]) index2++;
        	while(3 * arr[index3] <= arr[i - 1]) index3++;
        	while(5 * arr[index5] <= arr[i - 1]) index5++;
        	arr[i] = Math.min(2 * arr[index2], Math.min(3 * arr[index3], 5 * arr[index5]));
        }
        
        return arr[n];
    }
}
