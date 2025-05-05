import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int numerator = a * d + b * c;
        int denominator = b * d;

        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        System.out.println(numerator + " " + denominator);
    }
}
