package star;

public class Trie {

	private static class TrieNode {
		String key = "";
		TrieNode[] childs = new TrieNode[26];
	}

	private TrieNode root = null;

	/** Initialize your data structure here. */
	public Trie() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		TrieNode node = root;

		for (char c : word.toCharArray()) {
			if (node.childs[c - 'a'] == null) {
				node.childs[c - 'a'] = new TrieNode();
			}
			node = node.childs[c - 'a'];
		}

		node.key = word;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		return match(word.toCharArray(), 0, root, true);
	}

	/**
	 * Returns if there is any word in the trie that starts with the given
	 * prefix.
	 */
	public boolean startsWith(String prefix) {
		return match(prefix.toCharArray(), 0, root, false);
	}

	private boolean match(char[] chs, int index, TrieNode node, boolean completelyMatch) {
		if (index == chs.length) return completelyMatch ? !node.key.equals("") : true;
		return node.childs[chs[index] - 'a'] != null
				&& match(chs, index + 1, node.childs[chs[index] - 'a'], completelyMatch);
	}
}
