package set.a21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDictionary {
	private class TrieNode{
		private char val;
		private Map<Character, TrieNode> childs;
		private TrieNode(){
			this.childs = new HashMap<Character, TrieNode>();
		}
		private TrieNode(char ch){
			this();
			this.val = ch;
		}
		private boolean contains(char ch){
			return childs.containsKey(ch);
		}
		private TrieNode getChild(char ch){
			if(!childs.containsKey(ch)){
				childs.put(ch, new TrieNode(ch));
			}
			return childs.get(ch);
		}
		public String toString(){
			return "" + val;
		}
	}
	
	private TrieNode root = null;
	
	/** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = root;
        int index = 0;
        
        while(index < word.length()){
        	node = node.getChild(word.charAt(index++));
        }
        
        node.getChild('\0');
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        List<TrieNode> childs = new ArrayList<TrieNode>();
        childs.addAll(root.childs.values());
        
        return search(word, 0, childs);
    }
    
    private boolean search(String word, int k, List<TrieNode> childs){
    	boolean found = false;
    	
    	if(k == word.length()){
    		for(TrieNode node : childs){
    			if(node.val == '\0'){
    				found = true;
    				break;
    			}
    		}
    	}else{
    		List<TrieNode> nextChilds = new ArrayList<TrieNode>();
    		if(word.charAt(k) == '.'){
    			for(TrieNode node : childs){
    				nextChilds.addAll(node.childs.values());
    			}
    			found = true;
    		}else{
    			for(TrieNode node : childs){
    				if(node.val == (word.charAt(k))){
    					nextChilds.addAll(node.childs.values());
    					found = true;
    				}
    			}
    		}
    		if(found){
    			found = search(word, k + 1, nextChilds);
    		}
    	}
    	
    	return found;
    }
}
