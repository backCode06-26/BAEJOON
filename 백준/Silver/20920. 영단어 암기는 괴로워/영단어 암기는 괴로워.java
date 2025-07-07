import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            if (word.length() >= m) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }

        String[] keys = words.keySet().toArray(new String[0]);


        Arrays.sort(keys, (a, b) -> {

            int cmp = Integer.compare(words.get(b), words.get(a));
            if (cmp != 0) {
                return cmp;
            }
            cmp = b.length() - a.length();
            if (cmp != 0) {
                return cmp;
            }

            return a.compareTo(b);
        });

        for (String word : keys) {
            sb.append(word).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
