import java.util.Scanner;

public class Main {

    static boolean isInteeger(double num) {
        return num % 1 == 0.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int cnt = 0;

            for (int b = 1; b < n; b++) {
                for (int a = 1; a < b; a++) {

                    int value = a * a + b * b + m;
                    int aMultiplyB = a * b;

                    double result = (double) value / aMultiplyB;
                    if(isInteeger(result)) {
                        cnt++;
                    }
                }
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}