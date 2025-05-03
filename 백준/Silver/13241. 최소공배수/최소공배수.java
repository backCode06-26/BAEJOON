import java.util.Scanner;

public class Main {
    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long result = (a * b) / gcd(a, b);
        System.out.println(result);
    }
}
