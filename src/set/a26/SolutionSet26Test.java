package set.a26;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SolutionSet26Test {

	@Test
	public void testSolution264() {
		Solution264 s = new Solution264();
		int[] arr = new int[1691];
		for(int i = 1; i <= 1690; i++){
			arr[i] = s.nthUglyNumber(i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
