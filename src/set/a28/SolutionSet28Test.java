package set.a28;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionSet28Test {

//	@Test
	public void testSolution282() {
		Solution282 s = new Solution282();
		List<String> res = s.addOperators("105", 5);
		for(String line : res){
			System.out.println(line);
		}
	}
	
	@Test
	public void testSolution283() {
		Solution283 s = new Solution283();
		int[] arr = new int[]{1, 0, 3, 2, 0, 5};
		s.moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
