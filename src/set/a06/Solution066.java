package set.a06;

public class Solution066 {
	public int[] plusOne(int[] digits) {
		int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
        	digits[i] += carry;
        	carry = 0;
        	if(digits[i] >= 10){
        		carry = 1;
        		digits[i] %= 10;
        	}
        }
        
        if(carry > 0){
        	int[] copy = new int[digits.length + 1];
        	
        	for(int i = 0; i < digits.length; i++){
        		copy[i+1] = digits[i];
        	}
        	
        	copy[0] = carry;
        	
        	digits = copy;
        }
        
        return digits;
    }
}
