package BinarySearch.MedianOfTwoSortedArrays;
//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

public class Main {
	public static void main(String args[]){
		int a []= {4};
		int b []= {1};
		CouterSolution s = new CouterSolution();
		double result = s.findMedianSortedArrays(a, b);
		System.out.println(result);
	}
}
