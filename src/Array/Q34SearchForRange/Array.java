package Array.Q34SearchForRange;

public class Array {
	public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                result[0] = i;
                for(int j = i; j<nums.length; j++){
                    if(nums[j]==target){
                        result[1] = j;
                    }else{
                        return result;
                    }
                }
                return result;
            }
        }
        return result;
    }
}
