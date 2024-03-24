import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        int n = string.length();
        String[] suffixes = new String[n];

        // 모든 접미사를 생성하고 배열에 저장합니다.
        for(int i = 0; i < n; i++) {
            suffixes[i] = string.substring(i); // 문자열의 i번째부터 끝까지를 접미사로 저장
        }

        Arrays.sort(suffixes); // 접미사 배열을 사전식으로 정렬합니다.

        // 정렬된 접미사 배열 출력
        for(String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}