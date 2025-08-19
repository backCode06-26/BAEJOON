import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int version = sc.nextInt();

        if (version == 1) {
            for (String s : arr) {
                sb.append(s).append("\n");
            }
        } else if (version == 2) {
            for (String s : arr) {
                for (int i = s.length() - 1; i >= 0; i--) {
                    sb.append(s.charAt(i));
                }
                sb.append("\n");
            }
        } else if (version == 3) {
            for (int i=n-1; i>=0; i--) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
