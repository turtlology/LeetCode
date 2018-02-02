package BinarySearch.Q287FindTheDuplicateNumber;

public class Test {
	public static void main(String args[]) {
		int[] test = {1,2,2};
		findDuplicate(test);
		TwoPointers tp = new TwoPointers();
		tp.findDuplicate(test);
	}
	
	public static int findDuplicate(int[] nums) {
		System.out.println("previous");
        int fast = nums[0];
        int slow = nums[0];
        int i = 0;
        while(fast != slow){
        		System.out.println(i);
            i++;
            fast = nums[nums[fast]];
            slow = nums[slow];
            
        }
        
        int ptr1 = nums[0];
        int ptr2 = slow;
        while(ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}
