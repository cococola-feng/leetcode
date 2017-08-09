package set.a06;

public class Solution070 {
	public int climbStairs(int n) {
        if(n < 1){
        	return 0;
        }
        if(n < 2){
        	return 1;
        }
        if(n < 3){
        	return 2;
        }
        
        int pre = 2;
        int prebeforePre = 1;
        
        for(int i = 3; i <= n; i++){
        	int now = pre + prebeforePre;
        	prebeforePre = pre;
        	pre = now;
        }
        
        return pre;
    }
}
