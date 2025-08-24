import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextInt();
            double distance = sc.nextDouble();
            double aSpeed = sc.nextDouble();
            double bSpeed = sc.nextDouble();
            double flySpeed = sc.nextDouble();

            double allSpeed = (aSpeed + bSpeed);

            double result = (distance / allSpeed) * flySpeed;

            sb.append(i).append(" ").append(String.format("%.6f", result)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
