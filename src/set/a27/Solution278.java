package set.a27;

public class Solution278 {
	private int firstBadVersion = 0;
	
	public Solution278(int firstBadVersion){
		this.firstBadVersion = firstBadVersion;
	}
    public int firstBadVersion(int n) {
    	int left = 0, right = n;
    	
    	while(left < right){
    		int mid = (int)(((long)left + (long)right) / 2L);
    		boolean isBad = isBadVersion(mid);
    		if(isBad){
    			right = mid;
    		}else{
    			left = mid;
    		}
    		if(left + 1 == right) break;
    	}
    	
    	return right;
    }

    private boolean isBadVersion(int version){
    	return version >= firstBadVersion;
    }
}
