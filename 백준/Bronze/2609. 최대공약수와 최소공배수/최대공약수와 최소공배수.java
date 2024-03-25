import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        int A = Integer.parseInt(nums[0]);
        int B = Integer.parseInt(nums[1]);

        System.out.println(GCD(A, B));
        System.out.println((A * B) / GCD(A, B));
    }

    public static int GCD(int A, int B) {
        if (B == 0) {
            return A;
        }
        return GCD(B, A % B);
    }
}