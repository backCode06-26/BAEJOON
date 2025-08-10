import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();

            if (m == 0 & f == 0) break;

            sb.append(m + f).append("\n");
        }

        System.out.println(sb);
    }
}
