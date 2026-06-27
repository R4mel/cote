class Solution {
    public int[] solution(int n, int[] numlist) {
        int len = numlist.length;
        for (int i : numlist) {
            if (i % n != 0) {
                len--;
            }
        }
        int[] answer = new int[len];

        int count = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[count++] = numlist[i];
            }
        }

        return answer;
    }
}