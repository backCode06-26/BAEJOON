import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // ArrayList는 앞으로 당겨야하기 때문에 느리기 때문에 LinkedList를 사용합니다.
        // 그 이유는 시간복잡도는 o(1)이라서 더 빠르기 때문입니다.
        LinkedList<String> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();

            if (cmd.startsWith("pu")) {
                queue.add(cmd.substring(5));
            } else if (cmd.startsWith("p")) {
                bw.write((queue.peek() == null ?  "-1" : queue.pop())+"\n");
            } else if (cmd.startsWith("s")) {
                bw.write(queue.size()+"\n");
            } else if (cmd.startsWith("e")) {
                bw.write((queue.isEmpty() ?  "1" : "0")+"\n");
            } else if (cmd.startsWith("f")) {
                bw.write((queue.isEmpty() ?  "-1" : queue.peekFirst())+"\n");
            } else if (cmd.startsWith("b")) {
                bw.write((queue.isEmpty() ?  "-1" : queue.peekLast())+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
