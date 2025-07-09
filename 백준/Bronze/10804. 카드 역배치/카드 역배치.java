import java.util.Scanner;

public class Main {

    static int n = 10;
    static int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            while (b >= a) {
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;

                a += 1;
                b -= 1;
            }
        }

        for (int i=0; i<20; i++) {
            sb.append(nums[i]).append(" ");
        }
        System.out.println(sb);
    }
}
