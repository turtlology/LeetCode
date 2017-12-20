package Array.Q713SubarrayProductLessThanK;

public class TwoPointers {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        long temp = 1l;
        int i = 0; int j = 0; 
        while(j<len){
            temp*=nums[j];
            while(i<=j&&temp>=k){
                temp/=nums[i];
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }
}
