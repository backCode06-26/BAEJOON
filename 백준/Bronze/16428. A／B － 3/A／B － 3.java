import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger quo = a.divide(b);
        BigInteger rem = a.remainder(b);

        if (rem.compareTo(BigInteger.ZERO) < 0) {
            quo = quo.add(BigInteger.ONE);
            rem = rem.subtract(b);
        }

        System.out.println(quo);
        System.out.println(rem);
    }
}
