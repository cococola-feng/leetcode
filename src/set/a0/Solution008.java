package set.a0;

public class Solution008 {
	public int myAtoi(String str) {
		if(str == null || str.length() == 0){
			return 0;
		}
		
        char[] charArray = str.toCharArray();
        
        int index = 0;
        int flag = 1;
        int rel = 0;
        
        //left trim
        while(charArray[index] == ' '){
        	index++;
        }
        
        //check plus or minus
        if(charArray[index] == '+'){
        	index++;
        }else if(charArray[index] == '-'){
        	index++;
        	flag = -1;
        }
        
        while(index < charArray.length){
        	if(charArray[index] < '0' || charArray[index] > '9'){
        		break;
        	}
        	
        	if(rel > 1000000000){
        		if(flag > 0){
        			return Integer.MAX_VALUE;
        		}else{
        			return Integer.MIN_VALUE;
        		}
        	}
        	
        	rel *= 10;
        	int temp = (charArray[index] - '0');
        	
        	if(rel == Integer.MAX_VALUE - 7 && temp > 7){
        		if(flag > 0){
        			return Integer.MAX_VALUE;
        		}else{
        			return Integer.MIN_VALUE;
        		}
        	}
        	
        	rel += temp;
        	index++;
        }
        
        rel *= flag;
        
    	if(rel > Integer.MAX_VALUE){
    		rel = Integer.MAX_VALUE;
    	}else if(rel < Integer.MIN_VALUE){
    		rel = Integer.MIN_VALUE;
    	}
    	
        return rel;
    }
}
