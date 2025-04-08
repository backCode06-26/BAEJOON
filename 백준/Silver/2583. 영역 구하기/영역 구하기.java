import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static int areaX;
    static int areaY;
    static int[][] map;
    static boolean[][] visited;

    static int count;

    static int[] dy = {1, -1, 0, 0};
    static int[] dx = { 0, 0, 1, -1 };
    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int ax =  x + dx[i];
            int ay = y + dy[i];

            if (ax >= 0 && ax < areaX && ay >= 0 && ay < areaY) {
                if(!visited[ax][ay] &&  map[ax][ay] == 0) {
                    count++;
                    dfs(ax, ay);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();

        areaX = sc.nextInt();
        areaY = sc.nextInt();
        int n = sc.nextInt();

        map = new int[areaX][areaY];
        visited = new boolean[areaX][areaY];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int width = Math.max(x1, x2);
            int height = Math.max(y1, y2);
            int startWidth = Math.min(x1, x2);
            int startHeight = Math.min(y1, y2);

            for(int x = startHeight; x < height; x++){
                for(int y = startWidth; y < width; y++){
                    map[x][y] = 1;
                }
            }
        }


        for(int i = 0; i < areaX; i++){
            for(int j = 0; j < areaY; j++){
                if(!visited[i][j]  && map[i][j] == 0) {
                    count = 1;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        System.out.println(result.size());
        Collections.sort(result);
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }

    }
}
