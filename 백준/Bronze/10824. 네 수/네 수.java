import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        Long first = Long.parseLong(a + b);
        a = st.nextToken();
        b = st.nextToken();
        Long second = Long.parseLong(a + b);

        System.out.println(first + second);
    }
}
