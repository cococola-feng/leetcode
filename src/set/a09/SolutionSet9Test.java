package set.a09;

import java.util.List;

import org.junit.Test;

import common.TreeNode;

public class SolutionSet9Test {

//	@Test
	public void test091() {
		Solution091 s = new Solution091();
		System.out.println(s.numDecodings("1213"));
	}
	
//	@Test
	public void test093(){
		Solution093 s = new Solution093();
		List<String> list = s.restoreIpAddresses("1111");
		for(String str : list){
			System.out.println(str);
		}
	}
	
//	@Test
	public void test097() {
		Solution097 s = new Solution097();
		
		
		String s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
		String s2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
		String s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
		System.out.println(s1.length() + s2.length());
		System.out.println(s3.length());
		System.out.println(s.isInterleave(s1, s2, s3));
	}
	
//	@Test
	public void test098() {
		Solution098 s = new Solution098();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		
		System.out.println(s.isValidBST(root));
	}
	
	@Test
	public void test099() {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		
		Solution099 s = new Solution099();
		s.recoverTree(root);
	}

}
