package set.a21;

import java.util.ArrayList;
import java.util.List;


public class Solution212 {
	private final static char VISITING = '\0';
	private class TrieNode{
		String key = null;
		TrieNode[] childs = new TrieNode[26];
	}
	
	public List<String> findWords(char[][] board, String[] words) {
        List<String> rel = new ArrayList<String>();
        
        if(board == null || board.length == 0 || board[0].length == 0){
        	return rel;
        }
        
        int raws = board.length;
        int cols = board[0].length;
        
        TrieNode root = buildTrieNode(words);
        
        for(int i = 0; i < raws; i++){
        	for(int j = 0; j < cols; j++){
        		dfs(board, i, j, raws, cols, root, rel);
        	}
        }
        
        return rel;
    }
	
	private TrieNode buildTrieNode(String[] words){
		TrieNode root = new TrieNode();
		
		for(String word : words){
			TrieNode node = root;
			for(char c : word.toCharArray()){
				int i = c - 'a';
				if(node.childs[i] == null){
					node.childs[i] = new TrieNode();
				}
				node = node.childs[i];
			}
			node.key = word;
		}
		
		return root;
	}
	
	private void dfs(char[][] board, int i, int j, int raws, int cols, TrieNode node, List<String> rel){
		char c = board[i][j];
		TrieNode nextNode = node.childs[c - 'a'];
		
		if(nextNode == null) return;
		
		if(nextNode.key != null){
			rel.add(nextNode.key);
			nextNode.key = null;
		}
		
		board[i][j] = VISITING;
		
		if(i > 0 && board[i - 1][j] != VISITING) dfs(board, i - 1, j, raws, cols, nextNode, rel);
		if(i + 1 < raws && board[i + 1][j] != VISITING) dfs(board, i + 1, j, raws, cols, nextNode, rel);
		if(j > 0 && board[i][j - 1] != VISITING) dfs(board, i, j - 1, raws, cols, nextNode, rel);
		if(j + 1 < cols && board[i][j + 1] != VISITING) dfs(board, i, j + 1, raws, cols, nextNode, rel);
		
		
		board[i][j] = c;
	}
	
}
