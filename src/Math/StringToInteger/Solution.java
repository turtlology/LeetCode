package Math.StringToInteger;

public class Solution {
	 public int myAtoi(String str) {
		 if(str==null||str.length()==0) return 0;
		 str = str.trim();
		 char first = str.charAt(0);
		 int positive = 1;
		 long sum = 0;
		 int start = 0;
		 if(first == '-'){
			 positive = -1;
			 start++;
		 }else if (first == '+'){
			 start++;
		 }
		 for(int i = start; i<str.length(); i++){
			 
			 if(!Character.isDigit(str.charAt(i))){
				 return (int)sum*positive;
			 }
			 sum = sum*10+str.charAt(i)-'0';
			 if(positive==1&&sum*positive>Integer.MAX_VALUE){
				return Integer.MAX_VALUE;
			 }
			 if(positive==-1&&sum*positive<Integer.MIN_VALUE){
				 return Integer.MIN_VALUE;
			 }
		 }
		 return (int)sum*positive;
	 }
}