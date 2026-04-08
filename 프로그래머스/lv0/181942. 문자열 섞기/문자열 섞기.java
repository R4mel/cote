class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        char[] tmp1 = str1.toCharArray();
        char[] tmp2 = str2.toCharArray();
        for(int i=0; i<tmp1.length; i++){
            answer.append(tmp1[i]);
            answer.append(tmp2[i]);
        }
        return answer.toString();
    }
}