import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static String endWord = "#";
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {

            int cnt = 0;
            String str = br.readLine();

            if (str.equals(endWord)) {
                break;
            }

            char target = str.charAt(0);
            for (int i=2; i<str.length(); i++) {

                char current = Character.toLowerCase(str.charAt(i));
                if (current == target) {
                    cnt++;
                }
            }

            sb.append(target).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);

    }
}
