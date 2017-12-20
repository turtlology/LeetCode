package TwoPointers.Q26RemoveDuplicatesFromSortedArray;

//Make two pointers at different pace
//j means to traversal the rest of the array
//i is the index of resized array.
public class OneWay {
	public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int i = 0;
        for(int j = 1; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
