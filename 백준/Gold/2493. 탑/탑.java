import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] values = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && values[stack.peek()] <= values[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                sb.append(stack.peek() + 1).append(" ");
            } else {
                sb.append(0).append(" ");
            }

            stack.push(i);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
