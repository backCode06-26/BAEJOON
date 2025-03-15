import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a + b - c;
        System.out.println(result);

        int ab_str = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        result = ab_str - c;
        System.out.println(result);
    }
}
