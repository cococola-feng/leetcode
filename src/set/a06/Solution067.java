package set.a06;

public class Solution067 {
	public String addBinary(String a, String b) {
        StringBuffer rel = new StringBuffer();
        int carry = 0;
        
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        
        while(ia >= 0 || ib >= 0){
        	int sum = carry;
        	carry = 0;
        	if(ia >= 0){
        		sum += (a.charAt(ia) - '0');
        		ia--;
        	}
        	if(ib >= 0){
        		sum += (b.charAt(ib) - '0');
        		ib--;
        	}
        	if(sum > 1){
        		carry = 1;
        		sum %= 2;
        	}
        	char c = (char) ('0' + sum);
        	rel.append(c);
        }
        
        if(carry>0){
        	rel.append(carry);
        }
        
        return rel.reverse().toString();
        
        
    }
}
