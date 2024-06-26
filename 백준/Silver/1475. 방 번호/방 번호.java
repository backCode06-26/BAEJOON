import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int[] nums = new int[10];
        for(int i = 0; i < text.length(); i++) {
            int num = (text.charAt(i) - '0');
            if(num == 6 || num == 9) {
               if(nums[6] <= nums[9]) {
                   nums[6]++;
               } else {
                   nums[9]++;
               }
            }else {
                nums[num]++;
            }
        }

        int result  = 0;
        for(int i = 0; i < nums.length; i++) {
            result = Math.max(result, nums[i]);
        }
        System.out.println(result);
    }
}