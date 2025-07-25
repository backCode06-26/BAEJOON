import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(nums);

        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A') System.out.print(nums[0] + " ");
            else if (word.charAt(i) == 'B') System.out.print(nums[1] + " ");
            else if (word.charAt(i) == 'C') System.out.print(nums[2] + " ");
        }

    }
}