package BinarySearch.Q34SearchForRange;

public class BinarySearch {
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        int start = firstElement(nums, target);
        if(start == nums.length || nums[start] != target){
            return result;
        }
        result[0] = start;
        result[1] = firstElement(nums, target+1)-1;
        return result;
    }
    
    int firstElement(int[] nums, int target){
        int low = 0;
        int high = nums.length;
        while(low<high){
            int mid = (high+low)/2;
            if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
