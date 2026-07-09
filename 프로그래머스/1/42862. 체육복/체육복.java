import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> l = new ArrayList<>();
        for (int i : lost) {
            l.add(i);
        }
        List<Integer> r = new ArrayList<>();
        for (int i : reserve) {
            r.add(i);
        }

        List<Integer> both = new ArrayList<>();
        for (int rr : r) {
            if (l.contains(rr)) {
                both.add(rr);
            }
        }

        r.removeAll(both);
        l.removeAll(both);

        Collections.sort(r);
        Collections.sort(l);

        for (int rr : r) {
            if (l.contains(rr - 1)) {
                l.remove(Integer.valueOf(rr - 1));
            } else if (l.contains(rr + 1)) {
                l.remove(Integer.valueOf(rr + 1));
            }
        }

        return n - l.size();
    }
}