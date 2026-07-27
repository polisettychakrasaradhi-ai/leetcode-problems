class Solution {
    public int countEven(int num) {
        int temp = num;
        int sum = 0;
        
        // Calculate digit sum of 'num'
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        // If sum of digits of num is even, answer is num / 2
        // If sum of digits is odd, answer is (num - 1) / 2
        return sum % 2 == 0 ? num / 2 : (num - 1) / 2;
    }
}



