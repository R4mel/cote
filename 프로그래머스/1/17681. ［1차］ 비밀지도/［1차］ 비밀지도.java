class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String a = binary(n, arr1[i], arr2[i]);
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    private String binary(int n, int a1, int a2) {
        String str = Integer.toBinaryString(a1 | a2);

        StringBuilder sb = new StringBuilder();

        while (sb.length() + str.length() < n) {
            sb.append('0');
        }
        sb.append(str);

        return sb.toString();
    }
}