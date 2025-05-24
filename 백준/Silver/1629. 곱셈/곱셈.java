import java.util.Scanner;

public class Main {
    static long a;
    static long b;
    static long c;

    // 짝수 : a^b/2 * a^b/2
    // 음수 : a^b/2 * a^b/2 * a
    public static long splitDivision(long a, long b) {

        // 계산된 a의 값을 구함
        if(b == 1) {
            return a % c;
        }

        long result = splitDivision(a, b / 2);

        // 위에서 계산된 a로 결과를 구하는 로직으로
        // 10제곱을 계산해야할때 1 2 4 8 이러한 식으로
        // 곱해야하는 제곱에 점점 가까워지는 로직이다.
        if(b % 2 == 0) {
            return (result * result) % c;
        } else {
            return ((result * result) % c * a % c) % c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        System.out.println(splitDivision(a, b));
    }
}
