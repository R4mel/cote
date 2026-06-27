class Solution {
    public int solution(int hp) {
        int r1 = hp / 5;
        int r2 = hp % 5 / 3;
        int r3 = hp % 5 % 3 / 1;
        return r1 + r2 + r3;
    }
}