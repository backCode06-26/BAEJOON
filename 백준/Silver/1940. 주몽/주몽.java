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

        int count = 0;
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            if(nums[start] + nums[end] > m) {
                end--;
            } else if(nums[start] + nums[end] < m) {
                start++;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}
