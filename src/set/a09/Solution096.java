package set.a09;

public class Solution096 {
	public int numTrees(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        
        for(int i = 2; i <= n; i++){
        	int sum = 0;
        	for(int j = 1; j <= i; j++){
        		int l = nums[j - 1];
        		int r = nums[i - j];
        		sum += l * r;
        	}
        	nums[i] = sum;
        }
        
        return  nums[n];
    }
	
	private int recursiveCount(int start, int end) {
		if(start >= end){
			return 1;
		}
		int sum = 0;
		
		for(int i = start; i <=end; i++){
			int l = recursiveCount(start, i - 1);
			int r = recursiveCount(i + 1, end);
			sum += l * r;
		}
		
		return sum;
	}
}
