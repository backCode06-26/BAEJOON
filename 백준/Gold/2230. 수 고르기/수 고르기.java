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
        Arrays.sort(nums);

        int start = 0;
        int end = 1;
        int result = Integer.MAX_VALUE;
        while (end < n) {

            int value = nums[end] - nums[start];

            if(value == m) {
                result = m;
                break;
            } else if(value < m) {
                end++;
            } else {
                result = Math.min(result, value);
                start++;
            }
        }
        System.out.println(result);
    }
}
