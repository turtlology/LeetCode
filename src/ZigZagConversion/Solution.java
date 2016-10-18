package ZigZagConversion;

import java.lang.reflect.Array;

import javax.print.attribute.standard.RequestingUserName;

//try to use string buffer to deal with string arrays.

public class Solution {
	public String convert(String s, int numRows){
		StringBuffer[] buffer = new StringBuffer[numRows];
		char[] c = s.toCharArray();
		int length = c.length;
		for(int i = 0; i<numRows; i++){
			buffer[i] = new StringBuffer();
		}
		
		int i = 0;
		while(i<length){
			for(int j = 0; (j<numRows)&&(i<length); j++){
				buffer[j].append(c[i]);
				i++;
			}
			for(int j = numRows-2; (j>=1)&&(i<length); j--){
				buffer[j].append(c[i]);
				i++;
			}
		}
		
		System.out.println(buffer[0]);
		for(int j = 1; j<numRows; j++){
			buffer[0].append(buffer[j]);
			System.out.println(buffer[j]);
		}
		
		return buffer[0].toString();
	}
}
