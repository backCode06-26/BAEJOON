import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int num = sc.nextInt();

        StringBuilder str = new StringBuilder();

        while (value > 0) {
            int remainder = value % num;
            if (remainder < 10) {
                str.append(remainder);
            } else {
                char ch = (char) ('A' + (remainder - 10));
                str.append(ch);
            }
            value = value / num;
        }

        String result = str.reverse().toString();
        System.out.println(result);
        sc.close();
    }
}