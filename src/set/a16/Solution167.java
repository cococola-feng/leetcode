package set.a16;

public class Solution167 {
	public int[] twoSum(int[] numbers, int target) {
		int[] rel = new int[2];
		int i = 0, j = numbers.length - 1;
		
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				rel[0] = i + 1;
				rel[1] = j + 1;
				break;
			}
		}
		
		return rel;
	}
}
