import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = n / 2;
        int b = n - a;

        System.out.println((a + 1) * (b + 1));
    }
}
