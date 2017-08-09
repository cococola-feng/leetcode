package set.a06;

public class Solution069 {
	public int mySqrt(int x) {
        int left = 1;
        int right = x;
        
        while(left <= right){
        	int mid = (left + right)/2;
        	int product = mid * mid;
        	if(product == x){
        		return mid;
        	}else if(product < x){
        		if((mid+1)*(mid+1)>x){
        			return mid;
        		}
        		left = mid + 1;
        	}else{
        		right = mid - 1;
        	}
        }
        
        return 0;
    }
}
