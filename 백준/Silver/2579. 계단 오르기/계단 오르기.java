import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(steps[0]);
            return;
        }

        if (n == 2) {
            System.out.println(steps[0] + steps[1]);
            return;
        }

        int[] dp = new int[n];
        dp[0] = steps[0];
        dp[1] = steps[0] + steps[1];
        dp[2] = Math.max(steps[0] + steps[2], steps[1] + steps[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + steps[i], dp[i - 3] + steps[i - 1] + steps[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
