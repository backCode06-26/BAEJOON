import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        while (n > 0) {
            if(n % 5 == 0) {
                result += n / 5;
                break;
            } else {
                n -= 3;
                result++;
            }
            if (n < 0) {
                result = -1;
                break;
            }
        }

        System.out.println(result);

        // 이것은 조합을 사용하는 풀이로 실행되는 모든 조합을 찾아내어 횟수을 구한다.
    }
}