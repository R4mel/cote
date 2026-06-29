class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i=0; i<s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                answer = false;
                break;
            }
        }
        return (s.length() == 4 || s.length() == 6) && answer;
    }
}