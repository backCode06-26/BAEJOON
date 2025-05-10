import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            // Comparator : 음수 : 앞, 양수 : 뒤, 0: 바뀌지 않음으로 순서를 정할 수 있음
            if (absA != absB) {
                return absA - absB;
            } else {
                return a - b;
            }
        });
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                q.add(num);
            } else {
                bw.write(((q.peek() == null) ? 0 : q.poll())+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
