package set.a30.s307;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumArrayTest {

	@Test
	public void test() {
		int[] arr = new int[]{1, 3, 5};
		NumArray s = new NumArray(arr);
		int res = 0;
		res = s.sumRange(0, 2);
		s.update(1, 2);
		res = s.sumRange(0, 2);
	}

}
