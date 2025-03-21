import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 계산에 필요한 값을 계산한다.
        int t = Integer.parseInt(br.readLine());

        // 점수 배열
        int[] scores = new int[t];

        // 전체합
        int total = 0;
        for (int i = 0; i < t; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            total += scores[i];
        }

        Arrays.sort(scores);

        // 제외 해야하는 사람의 수 소수는 반올림한다.
        int person = (int) Math.round(t * 0.15);

        for (int i = 0; i < person; i++) {
            total -= scores[i];
            total -= scores[t-1-i];
        }

        // 15%를 제외한 전체합의 길이
        int count = t - person * 2;

        // 15%를 제외한 평균의 값을 반올림하는 코드
        int avg_total = Math.round((float) total / count);
        System.out.println(avg_total);
    }
}
