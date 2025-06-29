import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long reverseNum(long num) {
        long rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) {
            nums[i] = reverseNum(sc.nextLong());
        }

        Arrays.sort(nums);

        for (long num : nums) {
            System.out.println(num);
        }
    }
}
