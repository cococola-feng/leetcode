package set.a36;

public class Solution367 {
	public boolean isPerfectSquare(int num) {
        boolean res = false;
        
        int i = 1;
        
        do{
        	if(i * i == num){
        		res = true;
        		break;
        	}
        	i++;
        }while(i <= num / 2);
        
        return res;
    }
}
