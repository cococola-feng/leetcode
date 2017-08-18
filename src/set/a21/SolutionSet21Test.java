package set.a21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

public class SolutionSet21Test {

//	@Test
	public void test216() {
		Solution216 s = new Solution216();
		List<List<Integer>> rel = s.combinationSum3(3, 9);
		for(List<Integer> list : rel){
			System.out.println(list);
		}
	}
//	@Test
	public void test214() {
		Solution214 s = new Solution214();
		System.out.println(s.shortestPalindrome("aacecaaa"));
		System.out.println(s.shortestPalindrome("abcd"));
	}
	
//	@Test
	public void drawCPULine() {
		for(int i = 0; i < 100000; i++){
			for(long j = 0; j < 20000000000L; j++){
				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
//	@Test
	public void testWordDictionary() {
		WordDictionary wd = new WordDictionary();
		wd.addWord("bad");
		wd.addWord("dad");
		wd.addWord("mad");
		System.out.println(wd.search("pad"));
		System.out.println(wd.search("bad"));
		System.out.println(wd.search(".ad"));
		System.out.println(wd.search("b.."));
	}
	
//	@Test
	public void testWordDictionary_SE() {
		WordDictionary_SE wd = new WordDictionary_SE();
		wd.addWord("bad");
		wd.addWord("dad");
		wd.addWord("mad");
		System.out.println(wd.search("pad"));
		System.out.println(wd.search("bad"));
		System.out.println(wd.search(".ad"));
		System.out.println(wd.search("b.."));
	}
	
//	@Test
	public void testSolution218() {
		Solution218 s = new Solution218();
		int[][] buildings = new int[][]{ {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8} };
		List<int[]> rel = s.getSkyline(buildings);
		for(int[] coordinate : rel){
			System.out.println(Arrays.toString(coordinate));
		}
	}
	
//	@Test
	public void testSolution218_TH() {
		Solution218_TH s = new Solution218_TH();
		int[][] buildings = new int[][]{ {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8} };
		List<int[]> rel = s.getSkyline(buildings);
		for(int[] coordinate : rel){
			System.out.println(Arrays.toString(coordinate));
		}
	}
	
//	@Test
	public void testSolution218_TH_B() {
		Solution218_TH s = new Solution218_TH();
		int[][] buildings = new int[][]{ {0, 2, 3}, {2, 5, 3}};
		List<int[]> rel = s.getSkyline(buildings);
		for(int[] coordinate : rel){
			System.out.println(Arrays.toString(coordinate));
		}
	}
	
	//[[2,4,7],[2,4,5],[2,4,6]]
//	@Test
	public void testSolution218_TH_C() {
		Solution218_TH s = new Solution218_TH();
		int[][] buildings = new int[][]{ {2,4,7}, {2,4,5}, {2,4,6}};
		List<int[]> rel = s.getSkyline(buildings);
		for(int[] coordinate : rel){
			System.out.println(Arrays.toString(coordinate));
		}
	}
	
//	@Test
	public void testSolution218_TH_D() {
		Solution218_TH s = new Solution218_TH();
		int[][] buildings = new int[][]{ {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8} };
		List<int[]> rel = s.getSkyline(buildings);
		for(int[] coordinate : rel){
			System.out.println(Arrays.toString(coordinate));
		}
	}
	
//	@Test
	public void testComparator() {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		list.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
			
		});
		
		System.out.println(list);
	}
	
//	@Test
	public void testTreeSet(){
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(1);
		tree.add(3);
		tree.add(2);
		
		tree.remove(2);
		
		while(!tree.isEmpty()){
			System.out.println(tree.pollLast());
		}
	}
	
	@Test
	public void testSolution220() {
		Solution220 s = new Solution220();
		
		System.out.println(s.containsNearbyAlmostDuplicate(new int[]{-3, 3}, 2, 4));
	}
}
