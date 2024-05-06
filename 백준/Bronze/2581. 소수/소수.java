import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] primes = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= N; i += p) {
                    primes[i] = false;
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            if (primes[i]) {
                min = Math.min(min, i);
                sum += i;
            }
        }
        System.out.println((sum == 0) ? "-1" : sum + "\n" + min);
    }
}
