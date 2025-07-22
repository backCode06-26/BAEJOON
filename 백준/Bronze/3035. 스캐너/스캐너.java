import java.util.Scanner;

public class Main {
    static StringBuilder mainSb = new StringBuilder();

    static void repeat(String s, int x, int y) {
        StringBuilder subSb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            // x 좌표 구현
            for (int j = 0; j < x; j++) {
                subSb.append(s.charAt(i));
            }
        }

        for (int j = 0; j < y; j++) {
            mainSb.append(subSb);

            if (j != y - 1) {
                mainSb.append("\n");
            }
        }
        mainSb.append("\n");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int x = sc.nextInt();

        int zy = sc.nextInt();
        int zx = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < y; i++) {
            String str = sc.nextLine();

            repeat(str, zx, zy);
        }

        System.out.println(mainSb);
    }
}