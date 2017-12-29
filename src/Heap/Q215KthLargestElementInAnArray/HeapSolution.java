package Heap.Q215KthLargestElementInAnArray;

import java.util.PriorityQueue;

public class HeapSolution {
	public int findKthLargest(int[] nums, int k) {
        if (k>nums.length){
            return -1;
        }
        
        PriorityQueue<Integer> max = new PriorityQueue<Integer>();
        for (int i : nums){
            max.add(i);
        }
        int remain = nums.length - k+1;
        int result = 0;
        for (int i = 0; i < remain; i++){
            result = max.poll();
        }
        return result;
    }
}
