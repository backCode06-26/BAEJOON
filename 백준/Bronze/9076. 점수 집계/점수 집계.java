import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();

        mainLoop:
        for (int i = 0; i < n; i++) {

            int[] scores = new int[5];
            for (int j = 0; j < 5; j++) {
                scores[j] = sc.nextInt();
            }

            Arrays.sort(scores);

            int abs = Math.abs(scores[3] - scores[1]);
            if (abs >= 4) {
                sb.append("KIN").append("\n");
                continue mainLoop;
            }

            int result = scores[1] + scores[2] + scores[3];
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
