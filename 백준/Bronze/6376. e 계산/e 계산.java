import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    static int[] factorials = new int[10];

    public static int factorial(int n) {
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (factorials[i] == 0) {
                factorials[i] = factorials[i - 1] * i;
            }
        }

        return factorials[n];
    }

    public static void main(String[] args) {
        System.out.println("n e");
        System.out.println("- -----------");


        for(int i = 0; i <= 9; i++) {
            double sum = 0;

            for (int j = 0; j <= i; j++) {
                sum += 1.0 / factorial(j);
            }

            if (i <= 1) {
                System.out.printf("%d %.0f\n", i, sum);
            } else if (i == 2) {
                System.out.printf("%d %.1f\n", i, sum);
            } else {
                System.out.printf("%d %.9f\n", i, sum);
            }
        }
    }
}
