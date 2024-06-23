import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] nCart;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 배열 크기 입력
        int n = Integer.parseInt(br.readLine());
        nCart = new int[n];

        // 배열 원소 입력 및 정렬
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nCart[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nCart);

        // 검색할 숫자 개수 입력
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 각 숫자에 대해 이진 탐색 수행
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(findCart(num)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString());
    }

    public static int findCart(int num) {
        int left = 0;
        int right = nCart.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nCart[middle] == num) {
                return 1;
            } else if (nCart[middle] > num) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return 0;
    }
}
