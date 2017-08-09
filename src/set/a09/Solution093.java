package set.a09;

import java.util.ArrayList;
import java.util.List;

public class Solution093 {
	public List<String> restoreIpAddresses(String s) {
        List<String> rel = new ArrayList<String>();
        
        find(s, 0, 4, "", rel);
        
        return rel;
    }
	
	private void find(String s, int start, int remain, String address, List<String> rel){
		if(start >= s.length()){
			return;
		}
		
		if(remain == 1){
			if(start + 3 < s.length()){
				return;
			}
			
			String subString = s.substring(start);
			
			if(subString.length() > 1 && subString.charAt(0) == '0'){
				return;
			}
			
			int value = Integer.parseInt(subString);
			if(value < 256){
				rel.add(address + subString);
			}
		}else{
			for(int i = 1; i <= 3 && start + i <= s.length(); i++){
				String subString = s.substring(start, start + i);
				
				if(subString.length() > 1 && subString.charAt(0) == '0'){
					return;
				}
				
				int value = Integer.parseInt(subString);
				if(value < 256 && value >=0 ){
					find(s, start + i, remain - 1, address + subString+ "." , rel);
				}
			}
		}
	}
}
