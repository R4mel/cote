class Solution {
    public int solution(int a, int b) {
        int test1 = Integer.parseInt("" + a + b);
        int test2 = 2 * a * b;
        return Math.max(test1, test2);
    }
}