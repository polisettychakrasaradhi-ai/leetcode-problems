import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        // Map to store the last seen index of each character
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character was seen before, move left pointer 
            // to the right of the previous occurrence
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
