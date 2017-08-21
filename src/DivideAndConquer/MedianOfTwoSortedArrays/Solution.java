package DivideAndConquer.MedianOfTwoSortedArrays;

import java.util.ArrayList;

//calculate the index of the median number of the whole numbers.

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double result = 0.0;
    	int total = nums1.length+nums2.length;
    	int times = total/2;
    	if(nums1.length==0){
    		if(nums2.length%2==1){
    			return (double)nums2[times];
    		}else{
    			return (nums2[times-1]+nums2[times])/2.0;
    		}
    	}else if(nums2.length==0){
    		if(nums1.length%2==1){
    			return (double)nums1[times];
    		}else{
    			return (nums1[times-1]+nums1[times])/2.0;
    		}
    	}
    	ArrayList together = new ArrayList();
    	int pointer1 = 0;
    	int pointer2 = 0;
    	while(pointer1!=nums1.length&&pointer2!=nums2.length){
    		if(nums1[pointer1]<nums2[pointer2]){
    			together.add(nums1[pointer1]);
    			pointer1++;
    		}else{
    			together.add(nums2[pointer2]);
    			pointer2++;
    		}
    	}
    	System.out.println(pointer1);
    	System.out.println(pointer2);
    	if(pointer1!=nums1.length){
    		while(pointer1!=nums1.length){
    			together.add(nums1[pointer1]);
    			pointer1++;
    		}
    	}
    	if(pointer2!=nums2.length){
    		while(pointer2!=nums2.length){
    			together.add(nums2[pointer2]);
    			pointer2++;
    		}
    	}
    	if(total%2==0){
    		result = ((Integer)together.get(times-1)+(Integer)together.get(times))/2.0;
    	}else{
    		result = (Integer)together.get(times);
    	}
        return result;
    }
}
