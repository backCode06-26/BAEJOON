import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int[] dp = new int[1001];
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            list.add(N);

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int j = 4; j <= N; j++) {
                dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3]);
            }
        }
        for(int num : list) {
            System.out.println(dp[num]);
        }
    }
}