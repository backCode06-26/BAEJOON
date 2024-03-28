import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] strs = br.readLine().split(" ");
        int start = Integer.parseInt(strs[0]);
        int end = Integer.parseInt(strs[1]);

        for(int i =start ; i <= end; i++) {
            if(isPrime(i) != 0) {
                sb.append(isPrime(i)).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int isPrime(int num) {
        if (num <= 1) return 0;
//        그 숫자의 곱할수있는 최대의 수을 i * i으로 뜻한다.
        for (int i = 2; i * i <= num; i++) {
            // 1 이외의 수로 나뉘는 순간 소수가 아닌라는 것이다.
            // 2와 같다면, 실행되지 않는다.
            if (num % i == 0) return 0;
        }
        return num;
    }
}
