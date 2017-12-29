package Array.Q167TwoSumIIInputArrayIsSorted;

public class Twopointers {
	public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};
        if(numbers.length<2) return result;
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
        }
        return result;
    }
}
