import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] sitePw = br.readLine().split(" ");
            map.put(sitePw[0], sitePw[1]);
        }

        for (int i = 0; i < m; i++) {
            String site = br.readLine();
            bw.write(map.get(site));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
