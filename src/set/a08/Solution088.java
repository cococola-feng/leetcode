package set.a08;

public class Solution088 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
        	int j = m + i;
        	while(j > 0){
        		if(nums1[j - 1] > nums2[i]){
        			nums1[j] = nums1[j - 1];
        			j--;
        		}else{
        			break;
        		}
        	}
        	nums1[j] = nums2[i];
        }
    }
}
