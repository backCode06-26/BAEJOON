import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] cards = new long[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(cards);

            long sum = cards[0] + cards[1];
            cards[0] = sum;
            cards[1] = sum;
        }

        long sum = 0;
        for (long card : cards) {
            sum += card;
        }
        System.out.println(sum);
    }
}
