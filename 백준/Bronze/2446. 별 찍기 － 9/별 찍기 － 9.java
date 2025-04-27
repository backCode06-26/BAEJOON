import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n * 2 - 1; i++) {

            int black = (i > n - 1) ? n - ((i - (n - 1)) + 1) : i;
            int star = (i > n - 1) ? (2 * n -1) -black*2 : (2 * n -1) - i * 2;

            for (int j = 0; j < black; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
