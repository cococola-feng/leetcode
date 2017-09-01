package set.a31;

public class Solution318 {
	public int maxProduct(String[] words) {
        int max = 0;
        
        for(int i = 0; i < words.length - 1; i++){
        	for(int j = i + 1; j < words.length; j++){
        		if(!hasCommonChar(words[i].toCharArray(), words[j].toCharArray())){
        			max = Math.max(words[i].length() * words[j].length(), max);
        		}
        	}
        }
        
        return max;
    }
	
	private boolean hasCommonChar(char[] arr1, char[] arr2){
		for(char ch1 : arr1){
			for(char ch2 : arr2){
				if(ch1 == ch2){
					return true;
				}
			}
		}
		return false;
	}
}
