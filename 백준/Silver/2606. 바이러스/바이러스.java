import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int count;

    public static void dfs(int check) {
        if(visited[check]) {
           return;
        }
        visited[check] = true;
        count++;
        for (int num : list[check]) {
            dfs(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 리스트 초기화
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
            visited[i] = false;
        }

        // 연결 정보 받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);
        System.out.println(count-1);


        sc.close();
    }
}
