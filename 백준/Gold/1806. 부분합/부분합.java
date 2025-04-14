import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0;

        int result = Integer.MAX_VALUE;
        while(end <= n) {
            if(sum < m) {
                if(end == n) break;
                sum += nums[end++];
            } else {
                result = Math.min(result, (end - start));
                sum -= nums[start++];
            }
        }
        System.out.println(result == Integer.MAX_VALUE ? 0 : result);
    }
}
