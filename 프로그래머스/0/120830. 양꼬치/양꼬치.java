class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        return 12000 * n + (k - service) * 2000;
    }
}