class Solution {
    public String intToRoman(int num) {
        // Values and their corresponding Roman numeral representations in descending order
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Loop through each symbol-value pair
        for (int i = 0; i < values.length; i++) {
            // Repeat the symbol while the current value fits into num
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }
}
