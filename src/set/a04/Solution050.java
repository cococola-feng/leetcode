package set.a04;

public class Solution050 {
	public double myPow(double x, int n) {
        if (n > 0){
        	return pow(x, n);
        }else{
        	return pow(1.0/x, -n);
        }
        
    }
	
	private double pow(double x, int n){
		if(n == 0){
			return 1.0;
		}
		
		int index = 1;
        double rel = x;
        
        while(index * 2 < n && index < Integer.MAX_VALUE/2){
//        	System.out.println(n+"\t"+index);
        	index *= 2;
        	rel *= rel;
        }
        
        return rel * pow(x, n - index);
	}
}
