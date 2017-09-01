package set.a34;

public class Solution342 {
	public boolean isPowerOfFour(int num) {
        // The bits of num contains only one 1 and it's in odd position
		return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
