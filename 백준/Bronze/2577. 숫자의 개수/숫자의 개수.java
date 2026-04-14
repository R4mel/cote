import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int mul = 1;
        for (int i : nums) {
            mul *= i;
        }
        String s = String.valueOf(mul);

        // 17037300
        int[] ans = new int[10];
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : ans) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}