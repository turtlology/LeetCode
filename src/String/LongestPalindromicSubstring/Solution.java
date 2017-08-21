package String.LongestPalindromicSubstring;

import java.sql.Time;
import java.util.Date;

public class Solution {
    public String longestPalindrome(String s) {
    	String result = "";
        if(s.length()<=1){
        	return s;
        }
        
        String reverse = "";
        
        for(int i = 0; i<s.length(); i++){
        	reverse = reverse+s.charAt(s.length()-i-1);
        }
        
        if(s.equals(reverse)){
        	System.out.println("it's the same");
            return s;
        }
        
        result = longestCommonSubstring(s, reverse);
        
        return result;
    }
    
    public String longestCommonSubstring(String s1, String s2){
    	String result = "";
    	int[][] matrix = new int[s1.length()][s2.length()];
    	int longest = 0;
    	for(int i = 0; i<s1.length(); i++){
    		for(int j = 0; j<s2.length(); j++){
    			if(s1.charAt(i)==s2.charAt(j)){
    				if(i==0||j==0){
    					matrix[i][j]=1;
    					longest = longest>matrix[i][j]?longest:matrix[i][j];
    				}else{
    					matrix[i][j]=matrix[i-1][j-1]+1;
    					longest = longest>matrix[i][j]?longest:matrix[i][j];
    				}
    			}else{
    				matrix[i][j]=0;
    			}
    		}
    	}
    	for(int i = 0; i<s1.length(); i++){
    		for(int j = 0; j<s2.length();j++){
    			if(matrix[i][j]==longest){
    				if(i==s1.length()-(j-longest+1)-1){
    				for(int k = 0; k<longest; k++){
    					result = s2.charAt(j-k)+result;
    				}
    				}
    			}
    		}
    	}
//    	for(int i = 0; i<s1.length(); i++){
//    		for(int j = 0; j<s2.length(); j++){
//    			System.out.print(matrix[i][j]);
//    		}
//    		System.out.println();
//    	}
    	System.out.println(result);
    	
    	return result;
    }
}
