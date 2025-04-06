import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        String[] parts = command.split("-");

        int result = 0;

        for (int i=0; i<parts.length; i++) {
            int sum = 0;
            String[] nums = parts[i].split("\\+");

            for (String num : nums) {
                sum += Integer.parseInt(num);
            }

            if(i==0) {
                result += sum;
            } else {
                result -= sum;
            }
        }
        System.out.println(result);
    }
}