package set.a23;

public class Solution233 {
	public int countDigitOne(int n) {
		if(n <= 0) return 0;
		
		int base = 1000000000;
		while(base > n) base /= 10;
		
		int rel = 0;
		while(n > 0){
			int k = n / base;
			
			rel += k  * fun(base / 10);
			if(k >= 2){
				rel += base;
			}else{
				rel += ((n % base) + 1);
			}
			
			n %= base;
			base /= 10;
		}
		
        return rel;
    }
	
	public int fun(int base){
		if(base <= 0) return 0;
		return 10 * fun(base / 10) + base;
		
	}
}
