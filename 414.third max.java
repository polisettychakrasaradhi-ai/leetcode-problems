class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Integer num : nums) {
            // Skip duplicate values
            if (num.equals(first) || num.equals(second) || num.equals(third)) {
                continue;
            }

            // Update top 3 distinct maximums
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        // Return third maximum if it exists, otherwise return the maximum
        return third == null ? first : third;
    }
}
