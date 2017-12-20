package Array.Q31NextPermutation;

// First, traverse from the end of the array.
// Find out the first element that is not ascend.
// Second, traverse from the end again.
// Find out the first element that is larger than that element.
// Swap them
// reverse the elements from the first element
public class Array {
	public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
        int dec = nums.length-1;
        while(dec>0 && nums[dec]<=nums[dec-1]) dec--;
        
        if(dec==0){
            reverse(nums,0,nums.length-1);
            return;
        }else{
            dec--;
            System.out.println(dec);
            int s = nums.length-1;
            while(s>=dec){
                if(nums[s]>nums[dec]){
                    swap(nums,s,dec);
                    reverse(nums, dec+1, nums.length-1);
                    return;
                }
                s--;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int[]nums, int start, int end){
        for(int i = start; i<=(start+end)/2; i++){
            swap(nums,i,start+end-i);
        }
    }
}
