package set.a29;

import java.util.Arrays;
import java.util.TreeSet;

public class MedianFinder_O_N {
	
	private int[] arr = null;
	private int length = 0;
	private int index = 0;
    /** initialize your data structure here. */
    public MedianFinder_O_N() {
        arr = new int[1024];
        length = 1024;
        index = 0;
    }
    
    public void addNum(int num) {
    	if(index == length){
    		length *= 2;
    		arr = Arrays.copyOf(arr, length);
    	}
    	
    	int pos = index;
    	
    	while(pos > 0 && num < arr[pos - 1]){
    		arr[pos] = arr[pos - 1];
    		pos--;
    	}
    	
    	arr[pos] = num;
    	
    	index++;
    }
    
    public double findMedian() {
    	if(index %2 == 0){
    		return ((double)arr[index / 2] + (long)arr[index / 2 - 1]) / 2.0;
    	}else{
    		return (double)arr[(index - 1) / 2];
    	}
    }
}
