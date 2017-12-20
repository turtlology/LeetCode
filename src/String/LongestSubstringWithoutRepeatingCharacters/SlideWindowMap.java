package String.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class SlideWindowMap {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> window = new HashMap();
		int ans = 0;
		int i = 0;
		int n = s.length();
		int j = 0;
		for(;j<n;j++) {
			if(window.containsKey(s.charAt(j))) {
				i = Math.max(i, window.get(s.charAt(j)));
			}
			ans = Math.max(ans, j-i+1);
			window.put(s.charAt(j), j+1);
		}
		return ans;
	}
}
