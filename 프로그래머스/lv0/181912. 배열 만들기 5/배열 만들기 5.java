class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int[intStrs.length];
        int count = 0;
        for (int i = 0; i < intStrs.length; i++) {
            var tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmp > k) {
                answer[count++] = tmp;
            }
        }
        int[] ans = new int[count];
        for(int i=0; i<count; i++){
            ans[i] = answer[i];
        }
        return ans;
    }
}