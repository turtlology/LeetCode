package TwoPointers.Q26RemoveDuplicatesFromSortedArray;

public class BruteForce {
	public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 1; i<nums.length-count; i++){
            if(nums[i]==nums[i-1]){
                count++;
                for(int j = i;j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                if(i!=nums.length-1){
                    i--;
                }
                
            }
        }
        return nums.length-count;
    }
}
