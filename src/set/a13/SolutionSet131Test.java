package set.a13;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolutionSet131Test {

//	@Test
	public void test131() {
		Solution131 s = new Solution131();
		for(List<String> line : s.partition("cbbbcc")){
			System.out.println(line);
		}
	}
	
//	@Test
	public void test132() {
		Solution132 s = new Solution132();
		System.out.println(s.minCut("cbbbcc"));
	}

//	@Test
	public void test134() {
		Solution134 s = new Solution134();
		int[] gas = new int[]{6,1,4,3,5};
		int[] cost = new int[]{3,8,2,4,2};
		System.out.println(s.canCompleteCircuit(gas, cost));
	}
	
//	@Test
	public void test139() {
		Solution139 s = new Solution139();
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("a");
		wordDict.add("abc");
		wordDict.add("b");
		wordDict.add("cd");
		String str = "abcd";
		System.out.println(s.wordBreak(str, wordDict));
	}
//	@Test
	public void test139_DP() {
		Solution140_DP s = new Solution140_DP();
//		List<String> wordDict = new ArrayList<String>();
//		wordDict.add("a");
//		wordDict.add("abc");
//		wordDict.add("b");
//		wordDict.add("cd");
//		String str = "abcd";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		String str = "leetcode";
		System.out.println(s.wordBreak(str, wordDict));
	}
//	@Test
	public void test140() {
		Solution140 s = new Solution140();
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("cat");
		wordDict.add("cats");
		wordDict.add("and");
		wordDict.add("sand");
		wordDict.add("dog");
		String str = "catsanddog";
		System.out.println(s.wordBreak(str, wordDict));
	}
//	@Test
	public void testList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 0);
		list.add(2, 2);
		System.out.println(list.size());
	}
//	@Test
	public void test140_DP() {
		Solution140_DP s = new Solution140_DP();
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("cat");
		wordDict.add("cats");
		wordDict.add("and");
		wordDict.add("sand");
		wordDict.add("dog");
		String str = "catsanddog";
		System.out.println(s.wordBreak(str, wordDict));
	}
	@Test
	public void test140_DP_Domplex() {
		Solution140_DP s = new Solution140_DP();
		List<String> wordDict = new ArrayList<String>();
		String elem = "";
		for(int i = 0; i < 10; i++){
			elem += "a";
			wordDict.add(elem);
		}
		String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" ;
		System.out.println(s.wordBreak(str, wordDict));
		
	}
}
