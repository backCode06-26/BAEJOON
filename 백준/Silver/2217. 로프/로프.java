import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, nums[i] * (n-i));
        }
        System.out.println(result);

    }
}
