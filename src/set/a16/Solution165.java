package set.a16;

public class Solution165 {
	public int compareVersion(String version1, String version2) {
        int index1 = 0, index2 = 0;
        
        int rel = 0;
        
        while(index1 < version1.length() && index2 < version2.length()){
        	int tail1 = index1 + 1;
        	while(tail1 < version1.length() && version1.charAt(tail1) != '.') tail1++;
        	int tail2 = index2 + 1;
        	while(tail2 < version2.length() && version2.charAt(tail2) != '.') tail2++;
        	
        	int num1 = Integer.parseInt(version1.substring(index1, tail1));
        	int num2 = Integer.parseInt(version2.substring(index2, tail2));
        	
        	if(num1 < num2){
        		rel = -1;
        		break;
        	}else if(num1 > num2){
        		rel = 1;
        		break;
        	}
        	
        	index1 = tail1 + 1;
        	index2 = tail2 + 1;
        }
        
        if(rel == 0){
        	if(index1 < version1.length()){
        		return allZero(version1, index1) ? 0 : 1;
        	}else if(index2 < version2.length()){
        		return allZero(version2, index2) ? 0 : -1;
        	}else{
        		return 0;
        	}
        }
        
        return rel;
    }
	
	private boolean allZero(String str, int index){
		boolean rel = true;
		while(index < str.length()){
			if(str.charAt(index) != '0' && str.charAt(index) != '.'){
				rel = false;
				break;
			}
			index++;
		}
		return rel;
	}
}
