package Array.ContainerWithTheMostWater;

public class BruteForce {
	public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i<height.length; i++){
            for(int j = i; j<height.length; j++){
                int temp = Math.min(height[i],height[j])*(j-i);
                max = Math.max(max,temp);
            }
        }
        return max;
    }
}
