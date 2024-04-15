import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 2;
        StringBuffer sb = new StringBuffer();
        while (N > 1) {
            if(N % num == 0) {
                N /= num;
                sb.append(num).append("\n");
            } else {
                num++;
            }
        }
        System.out.println(sb);
    }
}