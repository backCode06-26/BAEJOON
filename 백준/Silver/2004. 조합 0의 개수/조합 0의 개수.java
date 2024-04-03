import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 메모리가 int형 밖에 사용하지 못함
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 값을 2 또는 5로 나누어서 더 작은 값이 조합의 뒤의 0의 개수이다.
        int twoCnt = get(n, 2) - get(m, 2) - get(n - m, 2);
        int fiveCnt = get(n, 5) - get(m, 5) - get(n - m, 5);

        System.out.println(Math.min(twoCnt, fiveCnt));
    }

    // n/k을 n이 k보다 작을때 까지 반복한다.
    private static int get(int n, int k) {
        int cnt = 0;

        while(n >= k) {
            cnt += n / k;
            n /= k;
        }

        return cnt;
    }
}
