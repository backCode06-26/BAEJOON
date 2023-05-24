import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String T = br.readLine();
            char start = T.charAt(0);
            char end = T.charAt(T.length() - 1);
            bw.write(String.valueOf(start) + end);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
