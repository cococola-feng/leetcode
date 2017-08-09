package set.a12;

public class Solution125 {
	public boolean isPalindrome(String s) {
       s = s.toLowerCase();
       int i = 0, j = s.length() - 1;
       while(i < j){
    	   if(!validCharacter(s.charAt(i))){
    		   i++;
    		   continue;
    	   }
    	   
    	   if(!validCharacter(s.charAt(j))){
    		   j--;
    		   continue;
    	   }
    	   
    	   if(s.charAt(i) == s.charAt(j)){
    		   i++;
    		   j--;
    	   }else{
    		   return false;
    	   }
       }
       return true;
    }
	
	private boolean validCharacter(char c){
		return c >= 'a' && c <= 'z' || c >='0' && c <= '9';
	}
}
