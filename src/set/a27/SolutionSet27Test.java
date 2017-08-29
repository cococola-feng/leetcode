package set.a27;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionSet27Test {

	@Test
	public void testSolution278() {
//		2126753390 versions
//		1702766719 is the first bad version.
		Solution278 s = new Solution278(1702766719);
		System.out.println(s.firstBadVersion(2126753390));
	}

}
