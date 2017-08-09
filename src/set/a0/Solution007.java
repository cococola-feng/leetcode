package set.a0;

public class Solution007 {
	public int reverse(int x) {
		int flag = x < 0 ? -1 : 1;
		int rel = 0;
		
		x *= flag;
		while(x > 0){
			if(rel >= Integer.MAX_VALUE / 10){
				rel = 0;
				break;
			}
			rel *= 10;
			rel += (x % 10);
			x /= 10;
		}
		
		return flag * rel;
    }
}
