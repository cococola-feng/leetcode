package set.a01;

public class Solution012 {
	private String[] characters = {"I","IV","V","IX","X","XL","L", "XC","C",  "CD", "D", "CM", "M"};
	private int[] numbers =       {1,   4,   5,  9,  10,  40, 50,   90,  100, 400,  500,  900, 1000};
	public String intToRoman(int num) {
        StringBuffer re = new StringBuffer();
        
        while(num > 0){
        	int index = numbers.length - 1;
        	
        	while(index > 0){
        		if(num >= numbers[index]){
        			break;
        		}else{
        			index--;
        		}
        	}
        	
        	re.append(characters[index]);
        	num -= numbers[index];
        }
        
        return re.toString();
    }
}
