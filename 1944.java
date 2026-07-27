import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // Monotonic stack to store heights

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            
            // Pop all shorter people to the right that current person can see
            while (!stack.isEmpty() && heights[i] > stack.peek()) {
                stack.pop();
                count++;
            }
            
            // If stack is not empty, person 'i' can also see the first taller person
            if (!stack.isEmpty()) {
                count++;
            }
            
            ans[i] = count;
            stack.push(heights[i]);
        }

        return ans;
    }
}
