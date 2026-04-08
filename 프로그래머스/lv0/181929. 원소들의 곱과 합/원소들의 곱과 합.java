class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int mulandadd = 0;
        for(int a:num_list){
            mul *= a;
        }
        for(int b: num_list){
            mulandadd += b;
        }
        mulandadd = mulandadd * mulandadd;
        if(mul < mulandadd) return 1;
        return 0;
    }
}