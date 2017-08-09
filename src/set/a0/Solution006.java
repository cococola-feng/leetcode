package set.a0;

import java.util.Arrays;

public class Solution006 {
	public String convert(String s, int numRows) {
		char[] charArray = s.toCharArray();
		int len = charArray.length;
		
		StringBuffer[] sbArray = new StringBuffer[numRows];
		for(int i = 0; i < numRows; i++){
			sbArray[i] = new StringBuffer();
		}
		
		int i = 0;
		while(i < len){
			for(int j = 0; j < numRows && i <len; j++){
				sbArray[j].append(charArray[i++]);
			}
			for(int j = numRows - 2; j > 0 && i < len; j--){
				sbArray[j].append(charArray[i++]);
			}
		}
		
		for(int j = 1; j < numRows; j++){
			sbArray[0].append(sbArray[j]);
		}
		
		return sbArray[0].toString();
    }
}
