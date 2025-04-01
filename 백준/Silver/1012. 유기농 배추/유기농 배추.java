import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int[][] cabbages;
    static boolean[][] visited;
    static int n, m;

    // 네방향을 검사하기 위한 배열
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        // 네 방향를 dfs 돌리는 코드
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            // 범위를 벗어나는 경우가 있기 때문에 제약
            if(cx >= 0 && cx < n && cy >= 0 && cy < m) {
                if(!visited[cx][cy] && cabbages[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;

            cabbages = new int[n][m];
            visited = new boolean[n][m];

            // 정보 입력
            for (int i=0; i<k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                cabbages[x][y] = 1;
            }

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if(!visited[i][j] && cabbages[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
