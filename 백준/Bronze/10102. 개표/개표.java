import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();

        char[] voteList = sc.nextLine().toCharArray();
        Arrays.sort(voteList);

        int ACnt = 0;
        int BCnt = 0;
        for (char c : voteList) {
            if (c == 'A') {
                ACnt++;
            } else if (c == 'B') {
                BCnt = (voteList.length - ACnt);
                break;
            }
        }

        System.out.println(ACnt > BCnt ? 'A' : (ACnt == BCnt ? "Tie" : 'B'));
    }
}