import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        if(N == 0) {
            System.out.println("0");
        } else {
            while (N != 1) {
                sb.append(Math.abs(N % (-2)));
                N = (int)Math.ceil((double) N / (-2));
            }
            sb.append(N);

            sb.reverse();
            System.out.println(sb);
        }
    }
}