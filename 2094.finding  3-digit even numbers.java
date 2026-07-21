import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // Count the frequency of each digit (0-9) in the input array
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        // Iterate through all 3-digit even numbers (100 to 998, step by 2)
        for (int i = 100; i < 1000; i += 2) {
            int d1 = i / 100;       // Hundreds digit
            int d2 = (i / 10) % 10; // Tens digit
            int d3 = i % 10;        // Units digit

            // Temporary frequency array for the digits in the current candidate number
            int[] currentFreq = new int[10];
            currentFreq[d1]++;
            currentFreq[d2]++;
            currentFreq[d3]++;

            // Check if we have enough of each digit in our input array
            if (currentFreq[d1] <= freq[d1] &&
                currentFreq[d2] <= freq[d2] &&
                currentFreq[d3] <= freq[d3]) {
                result.add(i);
            }
        }

        // Convert List to int[] array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
