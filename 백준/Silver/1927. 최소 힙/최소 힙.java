import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<n; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value != 0) {
                pq.add(value);
            } else {
                int minValue = pq.peek() == null ? 0 : pq.poll();
                bw.write(minValue + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
