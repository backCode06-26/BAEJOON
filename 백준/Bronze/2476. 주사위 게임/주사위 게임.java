import java.util.Scanner;

public class Main {
    public static int moneyCal(int a, int b, int c) {
        if (a == b && a == c) {

            return 10000 + a * 1000;
        } else {

            int num = (a == c) ? c : (a == b) ? b : (b == c) ? b : 0;

            if (num != 0) {

                return 1000 + num * 100;
            } else {

                int max = Math.max(a, Math.max(b, c));
                return max * 100;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int money = moneyCal(a, b, c);

            max = Math.max(money, max);
        }

        System.out.println(max);
    }
}
