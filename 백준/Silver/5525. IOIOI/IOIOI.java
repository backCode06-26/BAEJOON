import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();

        int ans = 0;
        for (int i = 0; i < m; i++) {

            if (str.charAt(i) == 'I') {
                int cnt = 0;
                while(true) {
                    if (i + 2 >= m) {
                        break;
                    }
                    if (str.startsWith("OI", i + 1)) {
                        cnt++;
                        i += 2;
                    } else {
                        break;
                    }
                }
                if (cnt >= n) {
                    ans += cnt - n + 1;
                }
            }
        }
        System.out.println(ans);
    }
}