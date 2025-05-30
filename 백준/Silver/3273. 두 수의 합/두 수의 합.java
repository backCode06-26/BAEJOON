import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int target = sc.nextInt();

        int answer = 0;

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int result = arr[start] + arr[end];

            if (result > target) {
                end -= 1;
            } else if (result < target) {
                start += 1;
            } else {
                answer++;

                start += 1;
                continue;
            }
        }
        System.out.println(answer);


    }
}
