package String.LongestSubstringWithoutRepeatingCharacters;

public class ASCIISolution {
	public int lengthOfLongestSubstring(String s) {
		int[] index = new int[128];
		int ans = 0;
		int n = s.length();
		for(int i = 0, j = 0; j<n; j++) {
			i = Math.max(index[s.charAt(j)],i);
			ans = Math.max(j-i, ans);
			index[s.charAt(j)] = j;
		}
		return ans;
	}
}
