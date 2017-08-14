package set.a21;

public class WordDictionary_SE {
	public class TrieNode {
		String key = "";
		TrieNode[] childs = new TrieNode[26];
    }
    
    private TrieNode root = new TrieNode();

    public void addWord(String word) {
    	TrieNode node = root;
    	
    	for(char c : word.toCharArray()){
    		if(node.childs[c - 'a'] == null){
    			node.childs[c - 'a'] = new TrieNode();
    		}
    		node = node.childs[c - 'a'];
    	}
    	
    	node.key = word;
    }

    public boolean search(String word) {
    	return match(word.toCharArray(), 0, root);
    }
    
    private boolean match(char[] chs, int k, TrieNode node) {
    	if(k == chs.length){
    		return !node.key.equals("");
    	}
    	
    	boolean rel = false;
    	if(chs[k] == '.'){
    		for(TrieNode nextNode : node.childs){
    			if(nextNode != null){
    				rel = match(chs, k + 1, nextNode);
    			}
    			if(rel){
    				break;
    			}
    		}
    	}else{
    		if(node.childs[chs[k] - 'a'] != null){
    			rel = match(chs, k + 1, node.childs[chs[k] - 'a']);
    		}
    	}
    	
    	return rel;
    }
}
