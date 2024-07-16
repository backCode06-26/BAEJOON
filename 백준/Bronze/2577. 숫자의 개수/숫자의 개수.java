import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int nums = a * b * c;
        int[] digitCount = new int[10];

        while(nums > 0) {
            int digit = nums % 10;
            digitCount[digit]++;
            nums /= 10;
        }

        for(int count : digitCount) {
            System.out.println(count);
        }
    }
}
