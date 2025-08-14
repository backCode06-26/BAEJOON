import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int legCnt = sc.nextInt();
            int chickenCnt = sc.nextInt();

            int x = legCnt - chickenCnt;
            int y = chickenCnt - x;

            sb.append(y).append(" ").append(x).append("\n");
        }
        System.out.println(sb);
    }
}
