import java.util.*;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int n;

    // 이러한 재귀함수는 실행이 다된다면 이전의 함수로 되돌아간다.
    public static void dfs(int check) {
        System.out.print(check+" ");
        visited[check] = true;
        for (int num : list[check]) {
            if (!visited[num]) {
                dfs(num);
            }
        }
    }
    public static void bfs(int check) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(check);
        visited[check] = true;

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            System.out.print(nowNode+" ");
            for (int num : list[nowNode]) {
                if(!visited[num]) {
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        list = new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }
        
        for (int i=1; i<=n; i++) {
            Collections.sort(list[i]);
        }

        visited = new boolean[n+1];
        dfs(v);
        System.out.println();

        visited = new boolean[n+1];
        bfs(v);
        System.out.println();

    }
}
