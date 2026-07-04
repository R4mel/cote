import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        // set = 3 num size = 4
        if (set.size() >= nums.length / 2) {
            return nums.length / 2;

            // set = 2, num size = 6
        } else {
            return set.size();
        }
    }
}