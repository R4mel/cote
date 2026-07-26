class Solution {
    public String solution(String s) {
        String[] s1 = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String ss : s1) {
            int tmp = Integer.parseInt(ss);
            if (min > tmp) {
                min = tmp;
            }
            if (max < tmp) {
                max = tmp;
            }
        }
        return min + " " + max;
    }
}