class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] result = new String[t.length() - p.length() + 1];
        int i = 0;
        while (i != t.length() - p.length() + 1) {
            result[i] = t.substring(i, i + p.length());
            i++;
        }

        for (String s : result) {
            if (Long.parseLong(s) <= Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}