import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 서로 다른 알파벳의 개수을 출력
        Scanner in = new Scanner(System.in);

        int max = 0;
        char ch = ' ';

        int[] nums = StringCount(in.next().toLowerCase());
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                ch = (char) (65+i);
            } else if(nums[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
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