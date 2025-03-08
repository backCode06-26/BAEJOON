import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int[] nums = new int[3];

            int max = 0;
            int index = 0;
            int nums_sum = 0;

            for(int i=0; i<nums.length; i++) {
                nums[i] = sc.nextInt();
                nums_sum += nums[i];
                if(nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            if(nums_sum == 0) break;
            nums[index] = 0;
            max *= max;

            int sum = 0;
            for (int num : nums) {
                sum += num * num;
            }

            System.out.println((sum==max) ? "right" : "wrong");
        }

    }
}
