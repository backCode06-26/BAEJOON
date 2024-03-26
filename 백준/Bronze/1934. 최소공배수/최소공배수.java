import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            String[] nums = br.readLine().split(" ");
            int A = Integer.parseInt(nums[0]);
            int B = Integer.parseInt(nums[1]);

            sb.append((A * B) / GCD(A, B)).append("\n");
        }
        System.out.println(sb);
    }

    public static int GCD(int A, int B) {
        if (B == 0) {
            return A;
        }
        return GCD(B, A % B);
    }
}