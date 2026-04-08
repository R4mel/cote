class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int [] q1: queries){
            int tmp1 = arr[q1[0]];
            int tmp2 = arr[q1[1]];
            arr[q1[0]] = tmp2;
            arr[q1[1]] = tmp1;
        }
        return arr;
    }
}