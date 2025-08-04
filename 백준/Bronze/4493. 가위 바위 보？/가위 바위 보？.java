import java.util.Scanner;

public class Main {

    static int winner(String p1, String p2) {
        if (p1.equals(p2)) return 0;

        else if (
                p1.equals("R") && p2.equals("S") ||
                        p1.equals("P") && p2.equals("R") ||
                        p1.equals("S") && p2.equals("P")
        ) return 1;

        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {

            int tc = sc.nextInt();
            sc.nextLine();

            int player1 = 0;
            int player2 = 0;
            for (int j=0; j<tc; j++) {
                String[] matches = sc.nextLine().split(" ");

                String p1 = matches[0];
                String p2 = matches[1];
                int playerWin = winner(p1, p2);

                if (playerWin == 1) player1++;
                else if (playerWin == 2) player2++;
            }

            if (player1 > player2) sb.append("Player 1");
            else if (player2 > player1) sb.append("Player 2");
            else sb.append("TIE");

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
