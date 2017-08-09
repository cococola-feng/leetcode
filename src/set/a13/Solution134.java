package set.a13;

public class Solution134 {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int len = gas.length;
		if (len == 0)
			return -1;

		int[] carry = new int[gas.length];

		int sum = 0;
		for (int i = 0; i < gas.length; i++)
			sum += carry[i] = gas[i] - cost[i];
		if (sum < 0)
			return -1;

		int i = 0, j = 0;
		sum = carry[0];

		while ((j + 1) % len != i) {
			if(sum < 0){
				i = (i + len - 1) % len;
				sum += carry[i];
			}else{
				j = (j + 1) % len;
				sum += carry[j];
			}
		}
		
		return i;

	}
}
