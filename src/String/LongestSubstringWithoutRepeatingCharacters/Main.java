package String.LongestSubstringWithoutRepeatingCharacters;
//NO3
//Given a string, find the length of the longest substring without repeating characters.

public class Main {
	public static void main(String args[]){
//		Solution s = new Solution();
		SlideWindowMap s = new SlideWindowMap();
		int result = s.lengthOfLongestSubstring("abcabcbb");
		System.out.println(result);
	}
}
