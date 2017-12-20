package Array.Q27RemoveElements;

//i is the index of the resized element
//j is the pointer to traverse the array
public class TwoPointers {
	public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
