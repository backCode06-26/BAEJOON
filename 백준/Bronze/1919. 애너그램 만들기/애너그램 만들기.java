import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 서로 다른 알파벳의 개수을 출력
        Scanner in = new Scanner(System.in);

        int[] arr1 = StringCount(in.next());
        int[] arr2 = StringCount(in.next());

        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            result += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println(result);
    }

    public static int[] StringCount(String str) {
        int[] count = new int[26];

        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            count[arr[i]-'a']++;
        }

        return count;
    }
}