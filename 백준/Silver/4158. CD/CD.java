import java.io.*;
import java.util.*;

public class Main {
    static int[] answer;

    public static boolean binarySearch(int num) {
        int low = 0;
        int high = answer.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == answer[mid]) {
                return true;
            } else if (num > answer[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            answer = new int[n];
            for (int i = 0; i < n; i++) {
                answer[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(answer);

            int point = 0;
            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(br.readLine());
                if (binarySearch(num)) {
                    point++;
                }
            }

            bw.write(point + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}