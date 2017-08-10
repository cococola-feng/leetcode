package set.a20;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	private static class TrieNode{
		char val;
		Map<Character, TrieNode> childs;
		
		public TrieNode(){
			childs = new HashMap<Character, TrieNode>();
		}
		
		public TrieNode(char ch){
			this.val = ch;
			childs = new HashMap<Character, TrieNode>();
		}
	}
	private TrieNode root = null;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        insertWord(word, 0, root);
    }
    
    private void insertWord(String word, int index, TrieNode node){
    	if(index == word.length()) return;
    	
    	if(!node.childs.containsKey(word.charAt(index))){
    		node.childs.put(word.charAt(index), new TrieNode(word.charAt(index)));
    	}
    	
    	insertWord(word, index + 1, node.childs.get(word.charAt(index)));
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return searchWord(word, 0, root, false);
    }
    
    private boolean searchWord(String word, int index, TrieNode node, boolean remains) {
    	if(index == word.length()) return remains ? (node.childs.size() != 0) : (node.childs.size() == 0);
    	
    	if(node.childs.containsKey(word.charAt(index))){
    		return searchWord(word, index + 1, node.childs.get(word.charAt(index)), remains);
    	}else{
    		return false;
    	}
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	return searchWord(prefix, 0, root, true);
    }
}