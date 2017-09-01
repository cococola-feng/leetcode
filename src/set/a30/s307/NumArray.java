package set.a30.s307;

public class NumArray {
	private int[] nums = null;
	private int[] sqrtSum = null;
	private int SQRT = 1;
	public NumArray(int[] nums) {
		if(nums == null || nums.length == 0){
			return;
		}
		
        this.nums = nums;
        SQRT = (int)Math.sqrt(nums.length);
        this.sqrtSum = new int[nums.length / SQRT];
        int index = 0;
        int sum = 0;
        while(index < nums.length){
        	if(index % SQRT == 0 && index != 0){
        		sqrtSum[index / SQRT - 1] = sum;
        		sum = 0;
        	}
        	sum += nums[index++];
        }
        if(index % SQRT == 0){
    		sqrtSum[index / SQRT - 1] = sum;
        }
    }
    
    public void update(int i, int val) {
    	if(nums == null){
    		return;
    	}
    	
        int gap = val - nums[i];
        nums[i] = val;
        
        int sqrtIndex = i / SQRT;
        if(sqrtIndex < sqrtSum.length){
        	sqrtSum[sqrtIndex]+= gap;
        }
    }
    
    public int sumRange(int i, int j) {
    	if(nums == null){
    		return 0;
    	}
    	
    	if(j < i){
    		return 0;
    	}
    	
    	i = i < 0 ? 0 : i;
    	j = j >= nums.length? nums.length - 1 : j;
    	
        int sqrtI = i / SQRT;
        int sqrtJ = j / SQRT;
        
        int res = 0;
        
        for(int sqrtIndex = sqrtI + 1; sqrtIndex < sqrtJ && sqrtIndex < sqrtSum.length; sqrtIndex++){
        	res += sqrtSum[sqrtIndex];
        }
        
        while(i < (sqrtI + 1) * SQRT  && i < nums.length){
        	res += nums[i++];
        }
        
        while(j >= sqrtJ * SQRT){
        	res += nums[j--];
        }
        
        return res;
    }
}
