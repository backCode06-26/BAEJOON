import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='<'){
                check = false;
                answer.append(sb.reverse()).append(c);
                sb.setLength(0);
            }else if(c == '>'){
                check = true;
                answer.append(sb).append(c);
                sb.setLength(0);
            }else if(c == ' '){
                if(check){
                    // 안에 없으면, 버퍼에 있는 값을 뒤집고 넣음
                    answer.append(sb.reverse()).append(c);
                    sb.setLength(0);
                }else{
                   // 안에 있으면, 그냥 넣음
                    answer.append(sb).append(c);
                    sb.setLength(0); 
                }
            } else{
                sb.append(c);
            }
        }
        System.out.println(answer.append(sb.reverse()));
    }
}