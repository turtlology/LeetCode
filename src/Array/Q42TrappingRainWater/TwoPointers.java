package Array.Q42TrappingRainWater;

public class TwoPointers {
	public int trap(int[] height) {
        if(height.length<3){
            return 0;
        }
        int result = 0;
        int i = 0;
        int j = height.length-1;
        //first find out the first edge to carry the water
        while(i<j&&height[i]<=height[i+1]) i++;
        while(i<j&&height[j]<=height[j-1]) j--;
        while(i<j){
            int l = height[i];
            int r = height[j];
            if(l<=r){
            		//while the 
                while(i<j&&l>=height[++i]){
                    result+=l-height[i];
                    System.out.println(result);
                }
            }else{
                while(i<j&&r>=height[--j]){
                    result+=r-height[j];
                }
            }
        }
        return result;
    }
}
