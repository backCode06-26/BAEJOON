import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger result = factorial(n);
        String resultString = result.toString();

        int countZeros = 0;
        for (int i = resultString.length() - 1; i >= 0; i--) {
            if (resultString.charAt(i) == '0') {
                countZeros++;
            } else {
                break;
            }
        }

        System.out.println(countZeros);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
