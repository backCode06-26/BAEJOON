import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String doc = in.readLine();
        String word = in.readLine();

        int startIdx = 0;
        int cnt = 0;

        while(true) {
            int findIdx = doc.indexOf(word, startIdx);
            if(findIdx < 0) {
                break;
            }

            startIdx = findIdx + word.length();
            cnt++;
        }
        System.out.println(cnt);
    }
}
