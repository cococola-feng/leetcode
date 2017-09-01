package set.a30;

import java.util.List;

import org.junit.Test;

public class Set30Test {

//	@Test
	public void testSolution301() {
		Solution301 s = new Solution301();
		List<String> res = null; 
				
//		res = s.removeInvalidParentheses("()())())()");
//		for(String str : res){
//			System.out.println(str);
//		}
//		System.out.println("---------------------------");
		
		res = s.removeInvalidParentheses(")d))");
		for(String str : res){
			System.out.println(str);
		}
	}
	
//	@Test
	public void testNumMatrix(){
		int[][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
		NumMatrix numMatrix = new NumMatrix(matrix);
		numMatrix.sumRegion(4, 4, 0, 0);
	}
	
	@Test
	/** Test Cases
	 *  1. 101 -> True 
	 *  2. 0 -> False
	 *  3. 00 -> False
	 *  4. 000 -> True
	 *  5. Some values bigger that Integer.MAX_VALUE
	 *  6. 111 -> False
	 */
	public void testSolution306() {
		Solution306 s = new Solution306();
		boolean res = s.isAdditiveNumber("02358");
		System.out.println(res);
	
	}

}
