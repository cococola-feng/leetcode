package set.a24;

public class Solution242 {
	public boolean isAnagram(String s, String t) {
        if(s == null) return t == null;
        if(t == null) return s == null;
        
        if(s.length() != t.length()) return false;
        
        int[] arr1 = countNum(s);
        int[] arr2 = countNum(t);
        
        boolean res = true;
        
        for(int i = 0; i < arr1.length; i++){
        	if(arr1[i] != arr2[i]){
        		res = false;
        		break;
        	}
        }
        
        return res;
    }
	
	private int[] countNum(String str){
		char[] arr = str.toCharArray();
		int[] res = new int[26];
		
		for(char ch : arr){
			res[ch - 'a']++;
		}
		
		return res;
	}
}
