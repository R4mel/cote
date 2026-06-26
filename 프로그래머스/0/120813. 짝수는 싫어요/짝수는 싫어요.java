class Solution {
    public int[] solution(int n) {
        int[] a;
        if (n % 2 == 0) {
            a = new int[n / 2];
        } else {
            a = new int[n / 2 + 1];
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                a[count++] = i;
            }
        }
        return a;
    }
}