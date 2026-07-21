import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            Set<Character> vowels = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                
                if (isVowel(ch)) {
                    vowels.add(ch);
                    // Check if all 5 vowels are present
                    if (vowels.size() == 5) {
                        count++;
                    }
                } else {
                    // Stop expanding if we encounter a consonant
                    break;
                }
            }
        }
        
        return count;
    }
    
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
