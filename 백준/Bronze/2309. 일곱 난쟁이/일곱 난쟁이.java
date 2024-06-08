import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] nums = new int[9];
        for(int i=0; i<nums.length; i++) {
            int n = sc.nextInt();
            nums[i] = n;
            sum += n;
        }
        Arrays.sort(nums);

        int a = 0,b = 0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(sum - nums[i] - nums[j] == 100) {
                    a=i;
                    b=j;
                    break;
                }
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(i != a && i != b) {
                System.out.println(nums[i]);
            }
        }
    }
}