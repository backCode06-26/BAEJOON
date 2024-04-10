import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = {"000", "001", "010", "011", "100", "101", "110", "111"};

        if(str.equals("0")) {
            System.out.println("0");
            return;
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i) - '0';
            sb.append(nums[num]);
        }
        
        while (sb.charAt(0)=='0') {
            sb = new StringBuffer(sb.substring(1));
        }

        System.out.println(sb);
    }
}
