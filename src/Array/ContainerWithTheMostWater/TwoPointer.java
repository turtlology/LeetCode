package Array.ContainerWithTheMostWater;

//Use two pointers, one at the beginning, one at the start.
//Move the shorter one to the middle.
//The max area is determined by the shorter one.
public class TwoPointer {
	public int maxArea(int[] height) {
		int max = 0; 
		int start = 0;
		int end = height.length-1;
		while(start!=end) {
			max = Math.max(max, Math.min(height[start], height[end])*(end-start));
			if(height[start]<height[end]) {
				start++;
			}else {
				end--;
			}
		}
		return max;
	}
}
