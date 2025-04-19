import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0, count = 0;
        // 먼저 모든 값을 돌아봐야함, 제약을 하기 위해 n으로 제약
        while (end <= n) {
            // 값이 작은 경우
            if(sum < m) {
                // 근데 인덱스는 n-1인데 마지막값도 체크하여야해서 제약을 만듬
                if(end == n) break;
                // 값이 작은 경우에는 마지막 값을 더해야함
                sum += nums[end++];
            } else {
                // 값이 같은 경우에는 체크를 함
                if(sum == m) count++;

                // 값이 큰 경우에는 아래와 같이 작동하지만
                // 값이 같은 경우에는 다음 값을 찾기 위해 다음값으로 가는 역할을 함
                sum -= nums[start++];
            }
        }
        System.out.println(count);
    }
}
