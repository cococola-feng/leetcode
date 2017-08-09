package set.a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionSet12Test {

//	@Test
	public void test121() {
		Solution121 s = new Solution121();
		System.out.println(s.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
	}
//	@Test
	public void test123() {
		Solution123 s = new Solution123();
		System.out.println(s.maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
	}
//	@Test
	public void test126() {
		String beginWord = "hit";
		String endWord = "cog";
		String[] words = new String[]{"hot","dot","dog","lot","log","cog"};
		List<String> wordList = new ArrayList<String>();
		for(String word : words){
			wordList.add(word);
		}
		
		Solution126 s = new Solution126();
		List<List<String>> rel = s.findLadders(beginWord, endWord, wordList);
		
		for(List<String> list : rel){
			System.out.println(list);
		}
	}
//	@Test
	public void test127() {
		String beginWord = "hit";
		String endWord = "cog";
		String[] words = new String[]{"hot","dot","dog","lot","log","cog"};
		List<String> wordList = new ArrayList<String>();
		for(String word : words){
			wordList.add(word);
		}
		
		Solution127 s = new Solution127();
		System.out.println(s.ladderLength(beginWord, endWord, wordList));
	}
//	@Test
	public void test128() {
		int[] nums = new int[]{1,2,0,1};
		Solution128 s = new Solution128();
		System.out.println(s.longestConsecutive(nums));
	}
//	@Test
	public void test130() {
		Solution130 s = new Solution130();
		char[][] board = new char[][]{{'X','O','X','X','X'},{'X','O','X', 'O','X'},{'X','O','O', 'O', 'X'},{'X','X','X','X', 'X'}};
		s.solve(board);
		
		for(char[] line : board){
			System.out.println(Arrays.toString(line));
		}
	}
}
