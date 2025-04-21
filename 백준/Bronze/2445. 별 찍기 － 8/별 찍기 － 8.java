import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n * 2 -1; i++) {
            int step = (i > n) ?  n -(i % n) : i;

            for (int j = 0; j < step ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < Math.abs((n - i) * 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < step; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
