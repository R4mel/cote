class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int common = Math.min(xCount[i], yCount[i]);

            for (int j = 0; j < common; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0)
            return "-1";
        if (sb.charAt(0) == '0')
            return "0";
        return sb.toString();
    }
}