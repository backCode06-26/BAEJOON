import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int asDiff = nums[1] - nums[0];
        int gsDiff = nums[1] / nums[0];

        int as = nums[nums.length - 1] + asDiff;
        int gs = nums[nums.length - 1] * gsDiff;

        int value = nums[1] + asDiff;
        System.out.println((value == nums[2]) ?  as: gs);
    }
}
