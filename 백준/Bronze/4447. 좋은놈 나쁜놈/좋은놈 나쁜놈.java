import java.util.Scanner;

public class Main {
    static String goodBadHero(String name) {
        int g = 0;
        int b = 0;

        for (int i=0; i<name.length(); i++) {
            char current = Character.toLowerCase(name.charAt(i));
            if (current=='g') g++;
            else if (current=='b') b++;
        }

        return (g > b) ? "GOOD" : (b > g) ? "A BADDY" : "NEUTRAL";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n  = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            sb.append(name).append(" is ").append(goodBadHero(name)).append("\n");
        }

        System.out.println(sb);
    }
}