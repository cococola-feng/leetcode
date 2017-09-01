package set.a30;

public class NumArray {
	private int[] sums = null;

	public NumArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}
		
		sums = new int[nums.length];
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++){
			sum = sums[i] = nums[i] + sum;
		}
	}

	public int sumRange(int i, int j) {
		i = i >= 0 ? i : 0;
		j = j < sums.length ? j : sums.length - 1;
		
		int res = sums[j];
		
		if(i > 0){
			res -= sums[i - 1];
		}
		
		return res;
	}
}
