package set.a0;

public class Solution009 {
	public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
        	return false;
        }
        
        int re = 0;
        while(x > re){
        	re *= 10;
        	re += x % 10;
        	x /= 10;
        }
        
        return x == re || x == re/10;
    }
}
