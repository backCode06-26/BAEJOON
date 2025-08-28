import java.util.Scanner;

public class Main {
    public static int getEarlyTime(int n) {

        int currentTime = 0;
        for (int i = 1;; i++) {
            if (i + (i * i) <= n) {
                currentTime = i;
            } else {
                return currentTime;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int classTime = sc.nextInt();

            int earlyEndTime = getEarlyTime(classTime);
            sb.append(earlyEndTime).append("\n");
        }

        System.out.println(sb.toString());
    }
}