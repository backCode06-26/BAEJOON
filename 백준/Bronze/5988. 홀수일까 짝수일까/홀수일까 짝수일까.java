import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            BigInteger num = sc.nextBigInteger();

            sb.append(num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)
                    ? "even" : "odd").append("\n");
        }

        System.out.println(sb);
    }
}
