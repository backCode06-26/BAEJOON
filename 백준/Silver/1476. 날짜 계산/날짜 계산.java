import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int year = 1;
        int e = 1, s = 1, m = 1;

        while (true) {
            if(e == E && s == S && m == M) {
                break;
            }
            year++;

            e = (e % 15) + 1;
            s = (s % 28) + 1;
            m = (m % 19) + 1;
        }

        System.out.println(year);
    }
}
