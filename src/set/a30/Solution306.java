package set.a30;

public class Solution306 {
	public boolean isAdditiveNumber(String num) {
        if(num == null){
        	return false;
        }
        
        num = num.replaceAll(" +", "");
        
        if(num.length() < 3){
        	return false;
        }
        
        return detect(num, 0, 0, -1, -1);
    }
	
	private boolean detect(String num, int begin, int index, int a, int b){
		if(index >= num.length()){
			if(begin < num.length()){
				int c = Integer.parseInt(num.substring(begin, index));
				return a + b == c;
			}else{
				return true;
			}
		}
		
		boolean rel = false;
		//Case 1: cut here.
		long c = Long.parseLong(num.substring(begin, index + 1));
		if(c >= Integer.MAX_VALUE){
			return false;
		}
				
		if(a == -1 && index < num.length() - 1){
			rel = detect(num, index + 1, index + 1, b, (int)c);
		}else if(a + b == c){
			rel = detect(num, index + 1, index + 1, b, (int)c);
		}
		
		//If prove to be true, no need to continue
		if(rel){
			return rel;
		}
		
		//Case 2: Extend the number c
		if(num.charAt(begin) != '0'){
			rel = detect(num, begin, index + 1, a, b);
		}
		
		return rel;
	}
}
