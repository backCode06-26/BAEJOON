import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                sb.append(' ');
            } else {
                if(ch >= 'a' && ch <= 'z') {
                    int result = (((ch - 'a') + 13) % 26 + 'a');
                    sb.append((char)result);
                } else if(ch >= 'A' && ch <='Z'){
                    int result = (((ch - 'A') + 13) % 26 + 'A');
                    sb.append((char)result);
                } else {
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb);
    }
}