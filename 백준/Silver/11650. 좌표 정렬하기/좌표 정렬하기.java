import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                // 값이 같다면 각 요소의 뒤 숫자를 오름차순으로 정렬한다.
                return e1[1] - e2[1];
            } else {
                // 값이 같다면 각 요소의 앞 숫자를 오름차순으로 정렬한다.
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}