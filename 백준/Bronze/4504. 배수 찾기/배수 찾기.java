import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        while (true) {

            int val = sc.nextInt();
            if (val == 0) {
                break;
            }

            sb
                    .append(val)
                    .append(val % n == 0 ? " is a multiple of " : " is NOT a multiple of ")
                    .append(n)
                    .append(".")
                    .append("\n");
        }

        System.out.println(sb);
    }
}
