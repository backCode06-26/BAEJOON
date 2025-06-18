import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            int[] stockPrices = new int[m];
            for (int j = 0; j < m; j++) {
                stockPrices[j] = sc.nextInt();
            }

            int max = stockPrices[stockPrices.length - 1];

            long sum = 0;
            for (int j = stockPrices.length-2; j >= 0; j--) {
                int currentStockPrice = stockPrices[j];

                if (currentStockPrice > max) {
                    max = currentStockPrice;
                } else {
                    sum += (max - currentStockPrice);
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}
