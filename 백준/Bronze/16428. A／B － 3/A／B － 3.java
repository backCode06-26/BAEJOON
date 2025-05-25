import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long quo = a / b;
        long rem = a % b;

        if (rem < 0) {
            quo += 1;
            rem -= b;
        }

        System.out.println(quo);
        System.out.println(rem);


    }
}
