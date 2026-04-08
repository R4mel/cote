class Solution {
    public int solution(int a, int b) {
        String test1 = "" + a + b;
        String test2 = "" + b + a;
        return Math.max(Integer.parseInt(test1), Integer.parseInt(test2));
    }
}