import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        int[] nums = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            int num = value.charAt(i) - '0';
            nums[i] = num;
        }

        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}