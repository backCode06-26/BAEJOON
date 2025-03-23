import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] nums = new int[t];
        for (int i=0; i<t; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int total = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            total += sum;
        }
        System.out.println(total);
    }
}
