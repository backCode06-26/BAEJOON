import java.util.Scanner;

public class Main {

    static int[] arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();

        int line = 1;
        // 라인의 갯수을 채크하는 코드
        while (line < X) {
            X -= line;
            line += 1;
        }

        int a = 0;
        int b = 0;
        if(line %  2 == 0) {
            a = X;
            b = line-X+1;
        } else {
            a = line-X+1;
            b = X;
        }
        System.out.printf("%d/%d", a, b);
    }
}