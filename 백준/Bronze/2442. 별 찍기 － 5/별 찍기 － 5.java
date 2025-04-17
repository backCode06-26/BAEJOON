import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int step = 1;
        for (int i=0; i<n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<step; j++) {
                System.out.print("*");
            }
            step += 2;
            System.out.println();
        }
    }
}
