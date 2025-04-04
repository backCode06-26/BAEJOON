import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int[][] apt;
    static boolean[][] visited;
    static int t, count;

    // 네 방향 이동을 위한 배열
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        // 네 방향 탐색
        for (int i = 0; i < 4; i++) {
            int ax = x + dx[i];
            int ay = y + dy[i];

            // 범위 체크
            if (ax >= 0 && ax < t && ay >= 0 && ay < t) {
                if (!visited[ax][ay] && apt[ax][ay] == 1) {
                    count++;  // 단지 크기 증가
                    dfs(ax, ay);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();

        t = sc.nextInt();
        sc.nextLine();

        apt = new int[t][t];
        visited = new boolean[t][t];

        // 정보 입력
        for (int i = 0; i < t; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < t; j++) {
                apt[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 단지 탐색
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (!visited[i][j] && apt[i][j] == 1) {
                    count = 1;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);  // 오름차순 정렬

        // 출력
        System.out.println(result.size());
        for (Integer num : result) {
            System.out.println(num);
        }
    }
}
