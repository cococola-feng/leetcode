package set.a09;

public class Solution091 {
	public int numDecodings(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		if(Integer.parseInt(s.substring(0, 1)) == 0){
			return 0;
		}
		
		int [] nums = new int[s.length() + 1];
		
		nums[0] = 1;
		nums[1] = 1;
		
		for(int i = 1; i < s.length(); i++){
			int num1 = Integer.parseInt(s.substring(i, i + 1));
			int num2 = Integer.parseInt(s.substring(i - 1, i + 1));
			int sum = 0;
			if(num1>0){
				sum += nums[i];
			}
			if(num2>= 10 && num2 <= 26){
				sum += nums[i - 1];
			}
			if(sum == 0){
				return 0;
			}else{
				nums[i+1] = sum;
			}
		}
		
		return nums[s.length()];
    }
	
	private int recursiveDecoding(String s, int start){
		if(start == s.length()){
			return 1;
		}
		
		int sum = 0;
		if(Integer.parseInt(s.substring(start, start + 1)) != 0){
			sum += recursiveDecoding(s, start + 1);
			if(start + 2 <= s.length() && Integer.parseInt(s.substring(start, start + 2)) <= 26){
				sum += recursiveDecoding(s, start + 2);
			}
		}
		
		return sum;
	}
}
