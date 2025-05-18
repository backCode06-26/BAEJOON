import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String str = sc.next();

        int r = 31;
        int m = 1234567891;

        long pow = 1;
        long sum = 0;

        for (int i = 0; i < t; i++) {
            int num = str.charAt(i) - 'a' + 1;
            sum += (num * pow) % m;
            pow = (r * pow) % m;
        }

        System.out.println(sum%m);
    }
}