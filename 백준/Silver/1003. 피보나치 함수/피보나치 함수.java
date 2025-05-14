import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] arr = new int[t];

        for (int i=0; i<t; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i=2; i<=40; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
        }

        for (int i=0; i<t; i++) {
            System.out.println(dp[arr[i]][0] + " " + dp[arr[i]][1]);
        }
    }
}
