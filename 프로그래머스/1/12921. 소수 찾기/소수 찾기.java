class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] a = new int[n+1];
        for(int i=2; i<=n; i++) {
            a[i] = i;
        }
        
        for(int i=2; i<= n; i++) {
            if(a[i] == 0) continue;
            
            for(int j=2*i; j<= n; j+=i) {
                a[j] = 0;
            }
        }
        
        for(int i: a) {
            if(i != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}