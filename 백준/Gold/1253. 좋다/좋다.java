import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] nums = new long[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextLong();
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i=0; i<n; i++) {
            long find = nums[i];
            int start = 0;
            int end = n-1;

            while(start < end) {
                if(nums[start] + nums[end] == find) {
                    if(start != i && end != i) {
                        count++;
                        break;
                    } else if(start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if(nums[start] + nums[end] > find) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        System.out.println(count);
    }
}
