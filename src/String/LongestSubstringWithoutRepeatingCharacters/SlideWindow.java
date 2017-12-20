package String.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class SlideWindow {
	public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        	Set window = new HashSet();
        	int i = 0;
        	int j = 0;
        	while(i<n&&j<n) {
        		if(window.contains(s.charAt(j))) {
        			window.remove(i);
        			i++;
        		}else {
        			System.out.println(s.charAt(j));
        			window.add(s.charAt(j));
        			j++;
        			ans = Math.max(ans, j-i);
        		}
        	}
        return ans;
    }
}
