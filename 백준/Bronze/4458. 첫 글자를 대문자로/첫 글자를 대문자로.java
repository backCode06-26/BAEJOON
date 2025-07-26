import java.util.Scanner;

public class Main {
    static String capitalizeFirst(String str) {
        char frist = Character.toUpperCase(str.charAt(0));
        String rest = str.substring(1);
        return frist + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            sb.append(capitalizeFirst(s)).append('\n');
        }
        System.out.println(sb);
    }
}