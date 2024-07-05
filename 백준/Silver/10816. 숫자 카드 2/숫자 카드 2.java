import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            // 앞에서 찾은 인덱스와 뒤에서 찾은 인덱스의 차를 구해야 함
            int num = in.nextInt();
            sb.append(upperBound(num, arr) - lowerBound(num, arr)).append(" ");
        }

        System.out.println(sb);
    }

    public static int lowerBound(int key, int[] arr) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (key <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int upperBound(int key, int[] arr) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (key < arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
