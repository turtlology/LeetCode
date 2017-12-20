package Array.Q16ThreeSumClosest;

import java.util.Arrays;

public class TwoPointers {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        if(nums.length<=3){
            for(int i = 0; i<nums.length; i++){
                ans+=nums[i];
            }
            return ans;
        }
        ans = nums[0]+nums[1]+nums[2];
        for(int i = 0; i<nums.length-2; i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(Math.abs(target-ans)>Math.abs(target-sum)){
                    ans = sum;
                    if(ans==target) return ans;
                }
                if(sum>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return ans;
    }
}
