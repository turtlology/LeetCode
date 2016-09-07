package MedianofTwoSortedArrays;
//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

public class Main {
	public static void main(String args[]){
		int a []= {};
		int b []= {2,3};
		Solution s = new Solution();
		double result = s.findMedianSortedArrays(a, b);
		System.out.println(result);
	}
}
