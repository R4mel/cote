class Solution {
    public String solution(int[] food) {
        // 1, 3, 4, 6 -> "1223330333221"
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(String.valueOf(i));
            }
        }

        sb.append("0");

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(String.valueOf(i));
            }
        }

        return sb.toString();
    }
}