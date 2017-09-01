package set.a39;

public class Solution400 {
	public int findNthDigit(int n) {
        long len = 1;
        long count = 9;
        
        while(n > len * count){
        	n -= len * count;
        	len++;
        	count *= 10;
        }
        
        int targetInt = (int) ((int)Math.pow(10, len -1) + (n - 1) / len);
        int intIndex = (int) ((n - 1) % len);
        char[] charArray = new Integer(targetInt).toString().toCharArray();
        return (int)(charArray[intIndex] - '0');
    }
}
