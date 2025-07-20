import java.util.Scanner;

public class Main {
    final static int RANGE = 5;

    static boolean isOrder(int[] nums) {
        return (nums[0] == 1 && nums[1] == 2 && nums[2] == 3 && nums[3] == 4 && nums[4] == 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[RANGE];
        for (int i = 0; i < RANGE; i++) {
            nums[i] = sc.nextInt();
        }

        int idx = 1;
        while (!isOrder(nums)) {
            if (nums[idx-1] > nums[idx]) {
                int temp = nums[idx-1];
                nums[idx-1] = nums[idx];
                nums[idx] = temp;

                for (int num : nums) {
                    sb.append(num).append(" ");
                }
                sb.append("\n");
            }

            idx++;
            if (idx >= RANGE) {
                idx = 1;
            }
        }

        System.out.print(sb);
    }
}