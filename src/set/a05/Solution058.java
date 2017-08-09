package set.a05;

public class Solution058 {
	public int lengthOfLastWord(String s) {
        int length = 0, index = s.length() - 1;
        
        while(index >= 0 && s.charAt(index) == ' ') index--;
        while(index >= 0 && s.charAt(index) != ' ') {length++;index--;}
        
        return length;
    }
}
