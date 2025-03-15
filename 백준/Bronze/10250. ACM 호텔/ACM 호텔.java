import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int t = sc.nextInt();
        for (int i=0; i<t; i++) {

            int h = sc.nextInt();
            sc.nextInt();
            int n = sc.nextInt();

            int floor = (n % h == 0) ? h : (n % h);
            int room = (n % h == 0) ? (n / h) : (n / h) + 1;

            sb.append((floor * 100) + room).append("\n");
        }
        System.out.println(sb);
    }
}
