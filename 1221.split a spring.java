class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'R') {
                balance++;
            } else {
                balance--;
            }

            // Every time balance hits 0, a balanced substring is completed
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
