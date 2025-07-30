import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            if (n1 == 0 && n2 == 0 && n3 == 0) {
                break;
            }

            int difference = n2 - n1;
            int target = n3 - n2;
            if (difference == target) {

                sb.append("AP ").append(n3 + difference).append("\n");
            } else {

                int divide = n2 / n1;
                sb.append("GP ").append(n3 * divide).append("\n");
            }
        }
        System.out.println(sb);
    }
}
