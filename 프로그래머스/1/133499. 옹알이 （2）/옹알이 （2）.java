class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = { "aya", "ye", "woo", "ma" };

        for (String s : babbling) {
            StringBuilder sb = new StringBuilder();
            int lastIndex = -1;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                sb.append(c);

                for (int i = 0; i < 4; i++) {
                    if (i != lastIndex && list[i].equals(sb.toString())) {
                        sb.setLength(0);
                        lastIndex = i;
                    }
                }
            }
            if (sb.toString().isBlank()) {
                answer++;
            }
        }

        return answer;
    }
}