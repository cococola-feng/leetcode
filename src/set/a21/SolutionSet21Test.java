package set.a21;

import java.util.List;

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
	
	@Test
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

}
