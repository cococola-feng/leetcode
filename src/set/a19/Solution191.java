package set.a19;

public class Solution191 {
	public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
        	count ++;
        	n &= (n-1);
        }
        return count;
    }
}
