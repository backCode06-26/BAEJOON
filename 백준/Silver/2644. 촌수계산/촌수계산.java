import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static int findX;
    static int findY;
    static int count = -1;

    public static void dfs(int start, int depth){
        visited[start] = true;

        for(int next : graph[start]) {
            if(!visited[next]) {
                if(findY == next) {
                    // 이러하게 값을 추가하는 이유는 현재 깊이도 포함하기 위함이다.
                    count = depth + 1;
                    return;
                }
                // 이러하게 값을 올리는 이유는
                // 이전의 깊이 탐색에서 값을 찾지 못하면 다시 값을 되돌리기 위함이다.
                dfs(next, depth+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        findX = sc.nextInt();
        findY = sc.nextInt();
        int t = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(findX, 0);
        System.out.println(count);
    }
}
