import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            switch (line[0]) {
                case "push" :
                    queue.offer(Integer.parseInt(line[1]));
                    break;
                case "pop" :
                    if(queue.peek() != null) bw.write(queue.poll()+"\n");
                    else bw.write("-1\n");
                    break;
                case "size" :
                    bw.write(queue.size()+"\n");
                    break;
                case "empty" :
                    bw.write((queue.isEmpty() ? 1 : 0)+"\n");
                    break;
                case "front" :
                    bw.write((queue.isEmpty() ? -1 : queue.peekFirst())+"\n");
                    break;
                case "back" :
                    bw.write((queue.isEmpty() ? -1 : queue.peekLast())+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
