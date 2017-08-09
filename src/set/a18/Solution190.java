package set.a18;

public class Solution190 {
	public int reverseBits(int n) {
        int rel = 0;
        for(int i = 0; i < 32; i++){
        	rel <<= 1;
        	if((n & 1) == 1) rel++;
        	n >>= 1;
        }
        return rel;
    }
}
