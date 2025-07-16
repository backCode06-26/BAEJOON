import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;

        int start = 0;

        int current = 0;
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();

            if (height > current) {
                if (current == 0) {
                    start = height;
                }
                current = height;
            } else {
                max = Math.max(max, (current-start));
                start = height;
                current = height;
            }
        }
        max = Math.max(max, (current-start));


        System.out.println(max);
    }
}
