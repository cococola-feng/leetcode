package set.a04;

public class Solution043 {
	public String multiply(String num1, String num2) {
		String rel = "";
        for (int i = num2.length() - 1; i >= 0; i--){
        	String tmp = multiply(num1, num2.charAt(i) - '0');
        	for(int j = i; j < num2.length() - 1; j++){
        		tmp += "0";
        	}
        	rel = add(rel, tmp);
        }
        
        return trim(rel);
    }
	
	public String multiply(String num1, int num2) {
		StringBuilder sb = new StringBuilder();
		
		int index = num1.length() - 1;
		int carry = 0;
		
		while (index >= 0){
			int accumulate = (num1.charAt(index) - '0') * num2;
			accumulate += carry;
			carry = 0;
			
			if (accumulate >= 10){
				carry = accumulate / 10;
				accumulate %= 10;
			}
			
			char c = (char) ('0' + accumulate);
			sb.append(c);
			
			index--;
		}
		
		if (carry > 0) {
			char c = (char) ('0' + carry);
			sb.append(c);
		}
		
		return sb.reverse().toString();
	}
	
	public String add(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		
		int index1 = num1.length() - 1;
		int index2 = num2.length() - 1;
		int carry = 0;
		
		while (index1 >= 0 || index2 >= 0){
			int sum = carry;
			carry = 0;
			if (index1 >= 0) {
				sum += (num1.charAt(index1) - '0');
			}
			if (index2 >= 0) {
				sum += (num2.charAt(index2) - '0');
			}
			if (sum >= 10) {
				carry = 1;
				sum %= 10;
			}
			char c = (char) ('0' + sum);
			sb.append(c);
			
			index1--;
			index2--;
		}
		
		if (carry > 0) {
			char c = (char) ('0' + carry);
			sb.append(c);
		}
		
		return sb.reverse().toString();
	}
	
	private String trim (String str){
		int index = 0;
		while (index < str.length() - 1) {
			if (str.charAt(index) != '0'){
				break;
			}
			index++;
		}
		
		return str.substring(index, str.length());
	}
}
