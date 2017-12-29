package Heap.Q239SlidingWindowMaximum;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSolution {
	public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0){
            return new int[0];
        }
        Queue<Integer> max = new PriorityQueue<Integer>(k, (a,b) -> (b-a));
        int[] result = new int[nums.length - k + 1];
        
        for (int i = 0; i<k; i++){
            max.offer(nums[i]);
        }
        result[0] = max.peek();
        for(int i = 0; i<result.length-1; i++){
            max.remove(nums[i]);
            max.offer(nums[i + k]);
            result[i+1] = max.peek();
        }
        return result;
    }
}
