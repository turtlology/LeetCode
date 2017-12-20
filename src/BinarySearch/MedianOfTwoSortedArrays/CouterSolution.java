package BinarySearch.MedianOfTwoSortedArrays;

public class CouterSolution {
	public double findMedianSortedArrays(int[] A, int[] B) {
		double result = 0.0;
		int total = A.length+B.length;
		if(total%2==1) {
			int counter = total/2;
			int i = 0;
			int j = 0;
			while(i<=A.length-1&&j<=B.length-1&&counter>0) {
				if(A[i]>B[j]) {
					j++;
				}else {
					i++;
				}
				counter--;
			}
			if(counter!=0) {
				if(i<A.length-1&&j>B.length-1) {
					i=i+counter;
					counter = 0;
				}else {
					j = j+counter;
					counter = 0;
				}
			}
			if(i<=A.length-1&&j<=B.length-1) {
				result = A[i]>B[j]?B[j]:A[i];
			}else if(i<=A.length-1&&j>B.length-1) {
				result = A[i];
			}else if(i>A.length-1&&j<=B.length-1){
				result = B[j];
			}
			
		}else {
			int counter = total/2-1;
			int i = 0;
			int j = 0;
			while(i<=A.length-1&&j<=B.length-1&&counter>0) {
				if(A[i]>B[j]) {
					j++;
				}else {
					i++;
				}
				counter--;
			}
			if(counter!=0) {
				if(i<A.length-1&&j>B.length-1) {
					i=i+counter;
					counter = 0;
				}else {
					j = j+counter;
					counter = 0;
				}
			}
			int temp1 = 0;
			int temp2 = 0;
			if(i<A.length-1&&j<B.length-1) {
				if(A[i]>B[j]){
					temp1 = B[j];
					j++;
					if(A[i]>B[j]){
						temp2 = B[j];
					}else {
						temp2 = A[i];
					}
				}else {
					temp1 = A[i];
					i++;
					if(A[i]>B[j]) {
						temp2 = B[j];
					}else {
						temp2 = A[i];
					}
				}
				
			}else if(i<A.length-1&&j>B.length-1) {
				temp1 = A[i];
				temp2 = A[i+1];
			}else if(i>A.length-1&&j<B.length-1){
				temp1 = B[j];
				temp2 = B[j+1];
			}else if(i<A.length-1&&j==B.length-1) {
				if(A[i]>=B[j]) {
					temp1 = B[j];
					temp2 = A[i];
				}else {
					temp1 = A[i];
					temp2 = A[i+1]>B[j]?B[j]:A[i+1];
				}
			}else if(i==A.length-1&&j<B.length-1){
				if(B[j]>=A[i]) {
					temp1 = A[i];
					temp2 = B[j];
				}else {
					temp1 = B[j];
					temp2 = B[j+1]>A[i]?A[i]:B[j+1];
				}
			}else {
				temp1 = A[i];
				temp2 = B[j];
			}
			result = ((double)temp1+temp2)/2;
		}
		return result;
	}
}
