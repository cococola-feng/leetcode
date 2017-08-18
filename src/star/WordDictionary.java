package star;

public class WordDictionary {
	private class TireNode{
		String key = "";
		TireNode[] childs = new TireNode[26];
	}
	
	private TireNode root = new TireNode();
	
	public void addWord (String word){
		TireNode node = root;
		
		for(char c : word.toCharArray()){
			if(node.childs[c - 'a'] == null){
				node.childs[c - 'a'] = new TireNode();
			}
			node = node.childs[c - 'a'];
		}
		
		node.key = word;
	}
	
	public boolean search(String word){
		return match(word.toCharArray(), 0, root);
	}
	
	private boolean match(char[] chs, int index, TireNode node){
		if(index == chs.length){
			return !node.key.equals("");
		}
		
		boolean rel = false;
		if(chs[index] == '.') {
			for(TireNode nextNode : node.childs){
				if(nextNode != null){
					rel = match(chs, index + 1, nextNode);
				}
				if(rel){
					break;
				}
			}
		}else{
			if(node.childs[chs[index] - 'a'] != null){
				rel = match(chs, index + 1, node.childs[chs[index] - 'a']);
			}
		}
		
		return rel;
	}
}
