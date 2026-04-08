class Solution {
    public String solution(String code) {
        int mode = 0;
        char[] arr = code.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(mode == 0) {
                if(arr[i] != '1' && i % 2 == 0){
                    sb.append(arr[i]);
                }
                if(arr[i] == '1'){
                    mode = 1;
                }
            }
            else {
                if(arr[i] != '1' && i % 2 != 0){
                    sb.append(arr[i]);
                }
                if(arr[i] == '1'){
                    mode = 0;
                }
            }
        }
        if(sb.toString().length() == 0) return "EMPTY";
        return sb.toString();
    }
}