import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();

            String result = (e - c) > r ? "advertise" : (e - c) < r ? "do not advertise" : "does not matter";
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
