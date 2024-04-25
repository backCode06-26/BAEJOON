import java.util.Scanner;

public class Main {

    static int[] arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        arr = new int[N];
        dp = new Integer[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        dp[0] = arr[0];
        max = arr[0];

        recur(N - 1);

        System.out.println(max);
    }

    // 시작은 뒤의 값부터 시작하는 것 같지만, 회귀함수을 통해서 뒤의 값부터 실힝이 된다
    static int recur(int N) {

        if(dp[N] == null) {
            dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);

            max = Math.max(dp[N], max);
        }

        return dp[N];
    }
    // 위의 내용 notion에 정리하기
}