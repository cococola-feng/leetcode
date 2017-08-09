package set.a15;

public class Solution151 {
	public String reverseWords(String s) {
		if(s == null){
			return s;
		}
		
		s = s.trim();
		
		if(s.length() == 0){
			return s;
		}
		
		char[] array = s.toCharArray();
		
		for(int i = 0; i < array.length / 2; i++){
			char tmp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmp;
		}
		
		int index = 0;
		while(index < array.length){
			while(index < array.length && array[index] == ' ') index++;
			
			int end = index + 1;
			while(end < array.length && array[end] != ' ') end++;
			
			for(int i = 0; i < (end - index) / 2; i++){
				char tmp = array[index + i];
				array[index + i] = array[end - 1 - i];
				array[end - 1 - i] = tmp;
			}
			
			index = end;
		}
		
		return new String(array).replaceAll(" +", " ");
    }
}
