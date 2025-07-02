import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            long num = sc.nextLong();
            System.out.println(num * num);
        } else {

            long[] nums = new long[n];
            for (int i=0; i<n; i++) {
                nums[i] = sc.nextLong();
            }
            Arrays.sort(nums);

            System.out.println(nums[0] * nums[nums.length-1]);
        }
    }
}
