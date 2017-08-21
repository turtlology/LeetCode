package HashTable.LongestSubstringWithoutRepeatingCharacters;
//Use three pointers
//Start is to show where is the start of the testing substring
//now is to show where is the end of the testing substring
//i is to show the traverse of the substring.

public class Solution {
	public int lengthOfLongestSubstring(String s) {
	    if(s.equals(""))return 0;
		int start = 0;
		int now = 1;
		int max = 1;
		char[] split = s.toCharArray();
		for(; now<s.length(); now++){
			for(int i = start; i<now; i++){
				if(split[now]==split[i]){
					max = max>now-start? max:now-start;
					System.out.println("start"+start);
					System.out.println("i"+i);
					System.out.println("now"+now);
					start++;
					now--;
					System.out.println("max"+max);
					System.out.println();
					break;
				}
			}
		}
		max = max>now-start?max:now-start;
		return max;
	}
}
