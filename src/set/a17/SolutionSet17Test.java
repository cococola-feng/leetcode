package set.a17;

import org.junit.Test;

public class SolutionSet17Test {

	// @Test
	public void test171() {
		Solution171 s = new Solution171();
		System.out.println(s.titleToNumber("AB"));
	}

	// @Test
	public void test172() {
		Solution172 s = new Solution172();
		System.out.println(s.trailingZeroes(1808548329));
	}

	// @Test
	public void test172_Fast() {
		Solution172_Fast s = new Solution172_Fast();
		System.out.println(s.trailingZeroes(1808548329));
	}

	private long factorial(long x) {
		long rel = 1;
		while (x != 1) {
			rel *= x;
			x--;
		}
		return rel;
	}

	// @Test
	public void test174() {
		int[][] array = new int[][] { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		Solution174 s = new Solution174();
		System.out.println(s.calculateMinimumHP(array));
	}

	// @Test
	public void test175() {
		int[][] array = new int[][] { { 1, -3, 3 }, { 0, -2, 0 }, { -3, -3, -3 } };
		Solution174_Se s = new Solution174_Se();
		System.out.println(s.calculateMinimumHP(array));
	}

	@Test
	public void test179() {
		Solution179 s = new Solution179();
//		System.out.println(s.largestNumber(new int[] { 3, 30, 34, 5, 9 }));
//		System.out.println(s.largestNumber(new int[] { 121, 12 }));
//		System.out.println(s.largestNumber(new int[] { 1, 2, 3, 1 }));
//		System.out.println(s.largestNumber(new int[] { 0, 0 }));
		int[] array = new int[] { 9051, 5526, 2264, 5041, 1630, 5906, 6787, 8382, 4662, 4532, 6804, 4710, 4542, 2116,
				7219, 8701, 8308, 957, 8775, 4822, 396, 8995, 8597, 2304, 8902, 830, 8591, 5828, 9642, 7100, 3976, 5565,
				5490, 1613, 5731, 8052, 8985, 2623, 6325, 3723, 5224, 8274, 4787, 6310, 3393, 78, 3288, 7584, 7440,
				5752, 351, 4555, 7265, 9959, 3866, 9854, 2709, 5817, 7272, 43, 1014, 7527, 3946, 4289, 1272, 5213, 710,
				1603, 2436, 8823, 5228, 2581, 771, 3700, 2109, 5638, 3402, 3910, 871, 5441, 6861, 9556, 1089, 4088,
				2788, 9632, 6822, 6145, 5137, 236, 683, 2869, 9525, 8161, 8374, 2439, 6028, 7813, 6406, 7519 };
		String right = "995998549642963295795569525905189958985890288238775871870185978591838283748308830827481618052787813771758475277519744072727265721971071006861683682268046787640663256310614560285906582858175752573156385565552654905441522852245213513750414822478747104662455545424532434289408839763963946391038663723370035134023393328828692788270926232581243924362362304226421162109163016131603127210891014";
		String rel = s.largestNumber(array);
		
		for(int i = 0; i < right.length(); i++){
			if((right.charAt(i) == rel.charAt(i))){
//				System.out.println(right.charAt(i) + " " + rel.charAt(i));
			}else{
				System.out.println(right.charAt(i) + " " + rel.charAt(i) + " <<<");
			}
		}

	}

}
