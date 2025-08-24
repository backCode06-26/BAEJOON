import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            int[] sides = new int[3];
            for (int j = 0; j < 3; j++) {
                sides[j] = sc.nextInt();
            }
            Arrays.sort(sides);

            String result = "no";
            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                result = "yes";
            }

            sb.append("Scenario #").append(i).append(":").append("\n").append(result).append("\n\n");
        }

        System.out.println(sb);
    }
}
