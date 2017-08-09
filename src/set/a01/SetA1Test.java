package set.a01;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SetA1Test {

//	@Test
	public void test() {
		int[] height = new int[10000000];
		int h = 1;
		for(int i = 0; i < height.length/2; i++){
			height[i] = h++;
		}
		for(int i = height.length/2; i < height.length; i++){
			height[i] = h--;
		}
		
		Solution011 s = new Solution011();
		long time1 = System.currentTimeMillis();
		s.maxArea(height);
		long time2 = System.currentTimeMillis();
		s.maxArea1(height);
		long time3 = System.currentTimeMillis();
		s.maxArea(height);
		long time4 = System.currentTimeMillis();
		
		System.out.println(time2 - time1);
		System.out.println(time3 - time2);
		System.out.println(time4 - time3);
		
	}
	
//	@Test
	public void test012() {
		Solution012 s = new Solution012();
		System.out.println(s.intToRoman(1980));
	}
	
//	@Test
	public void test014() {
		String[] strs = new String[]{"", "", ""};
		Solution014 s = new Solution014();
		System.out.println(s.longestCommonPrefix(strs));
	}
	
//	@Test
	public void test015() {
		int[] array = new int[]{-2,0,1,1,2};
		Solution015 s = new Solution015();
		List<List<Integer>> list = s.threeSum(array);
		for(List<Integer> l : list){
			System.out.println(Arrays.toString(l.toArray()));
		}
	}
	
	@Test
	public void test018() {
		int[] array = new int[]{-3,-2,-1,0,0,1,2,3};
		int target = 0;
		Solution018 s = new Solution018();
		System.out.println(s.fourSum(array, target).get(0));
	}

}
