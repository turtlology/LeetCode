package TwoPointers.Q88MergeSortedArray;

//merge from the tail of the array.
public class BetterSolution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
        int first = m - 1;
        int second = n - 1;
        
        while (first >= 0 && second >= 0) {
            if (nums1[first] > nums2[second]) {
                nums1[last] = nums1[first];
                first--;
            } else {
                nums1[last] = nums2[second];
                second--;
            }
            last--;
        }
        
        if (first < 0) {
            for (int i = 0; i <= last; i++) {
                nums1[i] = nums2[i];
            }
        }
        
    }
}
