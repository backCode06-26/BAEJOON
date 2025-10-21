import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int[][] maps;
    static boolean[][] visited;
    static Queue<int[]> bfs;
    static int[][] dist;
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        maps = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];

        int x = 0;
        int z = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                maps[i][j] = sc.nextInt();

                if (maps[i][j] == 2){
                    x = i;
                    z = j;
                } else if (maps[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }
        bfs(x, z);

        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void bfs(int x, int z) {
        bfs = new LinkedList<>();
        bfs.add(new int[] {x, z});

        visited[x][z] = true;

        while(!bfs.isEmpty()){
            int[] current = bfs.poll();
            int currentX = current[0];
            int currentZ = current[1];

            for (int d=0; d<4; d++) {
                int nx = currentX + dx[d];
                int nz = currentZ + dy[d];

                if ((nx < 0 || nx >= N || nz < 0 || nz >= M)) continue;
                if (visited[nx][nz]) continue;

                bfs.add(new int[] {nx, nz});
                dist[nx][nz] = dist[currentX][currentZ] + 1;
                visited[nx][nz] = true;

            }
        }
    }
}
