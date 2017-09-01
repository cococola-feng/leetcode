package set.a30;

public class NumArray_TLE {

	private int[] nums = null;

	public NumArray_TLE(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int i, int j) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int res = 0;
		while (i < nums.length && i <= j) {
			res += nums[i++];
		}
		return res;
	}
}
