import java.util.*;

class Solution {
    public int[] solution(int n) {
        var a = new ArrayList<Integer>();
        a.add(n);
        while(n != 1) {
            if(n % 2 == 0){
                a.add(n / 2);
                n /= 2;
            }
            else if(n % 2 == 1){
                a.add(3 * n + 1 );
                n = 3 * n + 1;
            }
        }
        return a.stream().mapToInt(i -> i).toArray();
    }
}