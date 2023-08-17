import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int vowel = 0, consomant = 0;

            String str = br.readLine().replaceAll("\\s+", "");
            
            for(int j=0; j<str.length(); j++) {
            	char ch = str.charAt(j);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consomant++;
                }
                
            }
            bw.write(consomant + " " + vowel);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
