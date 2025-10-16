import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] teamA = sc.nextLine().split(" ");
        String[] teamB = sc.nextLine().split(" ");

        int teamATotal = 0, teamBTotal = 0;
        boolean flag = false;

        for (int i = 0; i < teamA.length; i++) {

            teamATotal += Integer.parseInt(teamA[i]);
            if (teamATotal > teamBTotal) {
                flag = true;
            }
            teamBTotal += Integer.parseInt(teamB[i]);
            if (flag && teamBTotal > teamATotal) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
