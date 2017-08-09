package set.a08;

import java.util.ArrayList;
import java.util.List;

public class Solution089 {
	public List<Integer> grayCode(int n) {
		List<Integer> rel = new ArrayList<Integer>();
		
		if(n <= 0){
			rel.add(0);
			return rel;
		}
		
		List<String> bits = new ArrayList<String>();
		bits.add("");
		
		while(n-- > 0){
			bits = generate(bits);
		}
		
		for(String str : bits){
			rel.add(str2int(str));
		}
		
        return rel; 
    }
	
	private List<String> generate (List<String> list){
		List<String> rel = new ArrayList<String>();
		
		for(int i = 0; i < list.size(); i++){
			rel.add("0" + list.get(i));
		}
		
		for(int i = list.size() - 1; i >= 0; i--){
			rel.add("1" + list.get(i));
		}
		
		return rel;
	}
	
	private int str2int (String str){
		int sum = 0;
		for(char c : str.toCharArray()){
			sum *= 2;
			sum += (c - '0');
		}
		return sum;
	}
}
