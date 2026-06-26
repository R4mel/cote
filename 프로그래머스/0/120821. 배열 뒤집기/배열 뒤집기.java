class Solution {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length / 2; i++) {
            int tmp = num_list[i];
            num_list[i] = num_list[num_list.length - 1 - i];
            num_list[num_list.length - 1 - i] = tmp;
        }
        return num_list;
    }
}