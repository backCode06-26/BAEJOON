import java.io.BufferedReader;
import java.io.BufferedWriter;
// BufferedReader와 BufferedWriter을 쓸수있게 해줌
//BufferedReader = Scanner
//BufferedWriter = print + printf
import java.io.IOException;
//IOException이라는 에러을 예외처리하는것 같음
import java.io.InputStreamReader;
// 바이트의 정보을 텍스트로 바꾸어서 데이터을
// 입력봤을수있게 한는것
import java.io.OutputStreamWriter;
// 바이트의 정보을 텍스트로 바꾸어서 테이터을 출력하는것
// 입력 출력을 String타입의 정보이다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
//        .readLine()는 정보을 입력받는것이다.
        
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
//            .split()는 공백을 기준으로 
//            정보을 따로 입력봤는것이다.
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int sum = A + B;
            bw.write(sum + "\n");
//            .write()는 printf + print와 같은것이다
//            /n는 줄바꿈하는것임
        }

        bw.flush();
//        입력받은 정보을 넘기는것이다.
        bw.close();
        br.close();
//        정보의 입력와 출력하는것을 멈추는것이다.
    }
}