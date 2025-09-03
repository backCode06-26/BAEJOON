import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ownedSpaceships = sc.nextInt();
            int maxDistance = sc.nextInt();

            int successSpaceship = 0;
            for (int j = 0; j < ownedSpaceships; j++) {
                double maxSpeed = sc.nextDouble();
                int remainingFuel = sc.nextInt();
                int consumedFuel = sc.nextInt();

                successSpaceship += (maxDistance / maxSpeed) * consumedFuel <= remainingFuel ? 1 : 0;
            }
            sb.append(successSpaceship).append("\n");
        }
        System.out.println(sb);
    }
}
