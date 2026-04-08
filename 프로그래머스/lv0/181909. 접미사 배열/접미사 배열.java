import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> a = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            a.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(a);
        String [] ans = a.toArray(new String[a.size()]);
        return ans;
    }
}