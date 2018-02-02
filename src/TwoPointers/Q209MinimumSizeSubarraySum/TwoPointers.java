package TwoPointers.Q209MinimumSizeSubarraySum;

public class TwoPointers {
	public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = nums.length;
        int result = len + 1;
        
        while (right < len){
            while (sum < s && right < len){
                sum += nums[right++];
            }
            
            while (sum >=s){
                result = result > right - left ? right - left : result;
                sum -= nums[left++];
            }
        }
        return result == len + 1 ? 0 : result;
    }
}
