import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int num = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        for(int i = 0; i < num; i++) {
            int num1 = Integer.parseInt(strs[i]);
            if(isPrime(num1)) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
//        그 숫자의 곱할수있는 최대의 수을 i * i으로 뜻한다.   
        for (int i = 2; i * i <= num; i++) {
            // 1 이외의 수로 나뉘는 순간 소수가 아닌라는 것이다.
            // 2와 같다면, 실행되지 않는다.
            if (num % i == 0) return false;
        }
        return true;
    }
}
