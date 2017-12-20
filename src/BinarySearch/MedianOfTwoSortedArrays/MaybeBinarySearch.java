package BinarySearch.MedianOfTwoSortedArrays;

public class MaybeBinarySearch {
    public double findkthMin(int[] a,int m,int begin1,int[] b,int n,int begin2,int k){
        if(m>n) return findkthMin(b,n,begin2,a,m,begin1,k);
        
        if(m==0) return b[begin2+k-1];
        
        if(k==1) return Math.min(a[begin1],b[begin2]);
        
        int partA = Math.min(k/2,m);
        int partB = k-partA;
        if(a[begin1+partA-1]==b[begin2+partB-1])
            return a[begin1+partA-1];
        else if(a[begin1+partA-1]<b[begin2+partB-1])
            return findkthMin(a,m-partA,begin1+partA,b,n,begin2,k-partA);
        else
            return findkthMin(a,m,begin1,b,n-partB,begin2+partB,k-partB);
        
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        if((m+n)%2==1)
            return findkthMin(nums1,m,0,nums2,n,0,(m+n+1)/2);
        else 
		return (findkthMin(nums1, m, 0, nums2, n, 0, (m+n) / 2)
				+ findkthMin(nums1, m, 0, nums2, n, 0, (m+n) / 2 + 1)) / 2.0;
	
    }
}
