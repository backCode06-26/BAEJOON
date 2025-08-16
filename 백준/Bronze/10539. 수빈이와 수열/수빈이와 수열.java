import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        int prev = 0;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            int result = num * i;
            sb.append((result) - prev).append(" ");
            prev = result;
        }
        System.out.println(sb);
    }
}