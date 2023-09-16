import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;

            StringBuilder reversed = new StringBuilder(input);
            reversed.reverse();

            boolean result = input.equals(reversed.toString());

            bw.write(result ? "yes\n" : "no\n");
        }
        bw.close();
    }
}
