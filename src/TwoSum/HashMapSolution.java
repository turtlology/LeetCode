package TwoSum;

import java.util.HashMap;
import java.util.Map;

//use hash map get get the result

public class HashMapSolution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();//<value,index>
		for(int i = 0; i<nums.length; i++){
			int complement = target-nums[i];//a+b=c means c-b=a;
			if(map.containsKey(complement)){
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no two sum solution");
    }
}
