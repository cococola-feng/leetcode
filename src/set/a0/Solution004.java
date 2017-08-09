package set.a0;

public class Solution004 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int count = 0, limit = length / 2 + 1;
        boolean isEven = length % 2 == 0;
        double pre = 0.0, now = 0.0;
        
        int index1 = nums1.length - 1;
        int index2 = nums2.length - 1;
        
        while((index1 >= 0 || index2 >= 0) && count++ < limit){
        	pre = now;
        	if(index1 < 0){
        		now = nums2[index2];
        		index2--;
        	}else if(index2 < 0){
        		now = nums1[index1];
        		index1--;
        	}else if(nums1[index1] > nums2[index2]){
        		now = nums1[index1];
        		index1--;
        	}else{
        		now = nums2[index2];
        		index2--;
        	}
        }
        
        return isEven ? (now + pre) / 2.0 : now;
    }
}
