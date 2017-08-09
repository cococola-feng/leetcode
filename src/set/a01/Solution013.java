package set.a01;

public class Solution013 {
	private char[] characters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	private int[] numbers = { 1, 5, 10, 50, 100, 500, 1000 };

	public int romanToInt(String s) {
		char[] array = s.toCharArray();
		int index = array.length - 1;
		int rel = 0;
		int maxBase = 0;

		while (index >= 0) {
			int i = 0;
			while (array[index] != characters[i]) {
				i++;
			}
			
			if(numbers[i] >= maxBase){
				rel += numbers[i];
				maxBase = numbers[i];
			}else{
				rel -= numbers[i];
			}
			
			index--;
		}
		
		return rel;
	}
}
