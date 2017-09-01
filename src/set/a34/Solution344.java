package set.a34;

public class Solution344 {
	public String reverseString(String s) {
        if(s == null || s.length() < 2) return s;
        
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length / 2; i++){
        	char tmp = arr[i];
        	arr[i] = arr[arr.length - 1 - i];
        	arr[arr.length - 1 - i] = tmp;
        }
        
        return String.valueOf(arr);
    }
}
