package set.a17;

public class Solution179 {
	public String largestNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++){
        	int val = nums[i];
        	
        	int j = i - 1;
        	while(j >= 0 && compare(val, nums[j]) > 0) {
        		nums[j + 1] = nums[j];
        		j--;
        	}
        	nums[j + 1] = val;
        	
        }
        String rel = "";
        for(int i : nums){
        	rel += i;
        }
        return rel.replaceAll("^0+", "0");
    }

	// if a should be before b, return 1
	private int compare(int a, int b){
		String arr1 = new Integer(a).toString();
		String arr2 = new Integer(b).toString();
		
		while(arr1.length() < arr2.length()){
			arr1 += arr1.charAt(0);
		}
		
		while(arr2.length() < arr1.length()){
			arr2 += arr2.charAt(0);
		}
		
		long gap = Long.parseLong(arr1) - Long.parseLong(arr2);

		if(gap == 0){
			return b - a;
		}else{
			return (int)gap;
		}
		
	}
	/*private int compare(int a, int b) {
		String arr1 = new Integer(a).toString();
		String arr2 = new Integer(b).toString();

		int index1 = 0, index2 = 0;

		int rel = 0;

		while (index1 < arr1.length() && index2 < arr2.length()) {
			if (arr1.charAt(index1) > arr2.charAt(index2)) {
				rel = 1;
				break;
			} else if (arr1.charAt(index1) < arr2.charAt(index2)) {
				rel = -1;
				break;
			}
			index1++;
			index2++;
		}

		if (rel == 0) {
			if (index1 == arr1.length() && index2 != arr2.length()) {
				rel = 1;
			} else if (index1 != arr1.length() && index2 == arr2.length()) {
				rel = -1;
			}
		}

		return rel;
	}*/
}
