class Solution {
    public long solution(long n) {
        double root = Math.sqrt(n);
        if (root == (int) root) {
            return (long) ((root + 1) * (root + 1));
        } else
            return -1;
    }
}