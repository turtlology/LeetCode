package Array.Q35SearchIndex;

public class BinarySearch {
	public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int result = 0;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else if(nums[mid]==target){
                return mid;
            }else{
                high = mid;
            }
        }
        if(nums[low]<target){
            return low+1;
        }else{
            return low;
        }
    }
}
