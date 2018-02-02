package BinarySearch.Q287FindTheDuplicateNumber;


//If there is a duplicate number, there is a loop in the array so use fast pointer and slow pointer can find the duplicate
public class TwoPointers {
	public int findDuplicate(int[] nums) {
		System.out.println("now");
        int fast = nums[0];
        int slow = nums[0];
        int i = 0;
        do{
        		System.out.println(i);
        		i++;
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);
        
        int ptr1 = nums[0];
        int ptr2 = slow;
        while(ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}
