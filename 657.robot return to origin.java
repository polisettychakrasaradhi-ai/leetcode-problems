class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            }
        }
        
        // Robot returns to the origin if both x and y are 0
        return x == 0 && y == 0;
    }
}
