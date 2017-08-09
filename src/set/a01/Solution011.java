package set.a01;

public class Solution011 {
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int max = 0;

		while (left < right) {
			int temp = (height[left] < height[right] ? height[left] : height[right]) * (right - left);
			max = max > temp ? max : temp;
			
			if(height[left] < height[right]){
				left++;
			}else{
				right--;
			}
		}
		
		return max;
	}
	public int maxArea1(int[] height) {
	    int left = 0, right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right])
					* (right - left));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return maxArea;
	}
}
