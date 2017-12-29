package TwoPointers.Q88MergeSortedArray;

public class MySolution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; 
        int j = 0;
        while(i<m+j&&j<n){
            if(nums1[i]>nums2[j]){
                for(int k = m+n-1; k>i; k--){
                    nums1[k] = nums1[k-1];
                }
                nums1[i] = nums2[j];
                j++;
            }
            i++;
        }
        while(j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}
