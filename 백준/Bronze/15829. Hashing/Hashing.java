import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();
        String str = sc.next();
        sc.close();

        int total = 0;
        for (int i = 0; i < n; i++) {
            int num = (int) ((str.charAt(i) - 'a' + 1) * Math.pow(31,i));
            total += num;
        }
        System.out.println(total);
    }
}
