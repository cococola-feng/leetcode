package set.a28;

public class Solution290 {
	public boolean wordPattern(String pattern, String str) {
        char[] charArr = pattern.toCharArray();
        String[] strArr = str.trim().replaceAll(" +", " ").split(" ");
        
        if(charArr.length != strArr.length) return false;
        
        for(int i = 0; i < charArr.length; i++){
        	for(int j = i + 1; j < charArr.length; j++){
        		if((charArr[i] == charArr[j]) != (strArr[i].equals(strArr[j]))){
        			return false;
        		}
        	}
        }
        
        return true;
    }
}
