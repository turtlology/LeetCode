package Array.TwoSum;

import java.util.HashMap;
import java.util.Map;

//use hash map to get the result
//hash map sometimes can be faster than simply recursive.
//time complexity: O(n)

public class HashMapSolution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();//<value,index>
		for(int i = 0; i<nums.length; i++){
			int complement = target-nums[i];//a+b=c means c-b=a;
			if(map.containsKey(complement)){//here no need to test if the complement is the element itself, because we add the element at the end of knowing if the complements is already in the map.
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no two sum solution");
    }
}
