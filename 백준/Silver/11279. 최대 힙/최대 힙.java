import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                pq.add(num);
            } else {
                bw.write((pq.peek() == null ? 0 : pq.poll())+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
