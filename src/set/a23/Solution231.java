package set.a23;

public class Solution231 {
	public boolean isPowerOfTwo(int n) {
		return n <= 0 ? false : (n & (n - 1)) == 0; 
    }
}
