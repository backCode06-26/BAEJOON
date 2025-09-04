import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int big = sc.nextInt();
            int small = sc.nextInt();

            int result = (int) Math.pow((double) big / small, 2);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}