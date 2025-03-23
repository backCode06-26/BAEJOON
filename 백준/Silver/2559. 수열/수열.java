import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt()-1;

        int[] nums = new int[n];
        for (int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int maxNum = Integer.MIN_VALUE;
        for (int i=0; i<nums.length-m; i++) {
            int total = nums[i];
            for (int j=1; j<=m; j++) {
                total += nums[i+j];
            }
            maxNum = Math.max(maxNum, total);
        }
        System.out.println(maxNum);
    }
}
