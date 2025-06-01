import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<int[]> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings.add(new int[]{start, end});
        }
        
        meetings.sort((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        int now = 0;
        int answer = 0;
        for (int[] meeting : meetings) {
            if (meeting[0] >= now) {
                answer++;
                now = meeting[1];
            }
        }

        System.out.println(answer);
    }
}
