class Solution {
    public int solution(int n) {
        int root = (int) Math.sqrt(n);
        if(root * root == n) return 1;
        else return 2;
    }
}