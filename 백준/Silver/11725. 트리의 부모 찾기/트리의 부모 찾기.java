import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int[] answer;

    static void DFS(int num) {
        visited[num] = true;
        for (int i : tree[num]) {
            if (!visited[i]) {
                answer[i] = num;
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 들어가는 데이터를 구현함
        int n = sc.nextInt();
        visited = new boolean[n+1];
        tree = new ArrayList[n+1];
        answer = new int[n+1];

        for (int i=0; i<tree.length; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i=1; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            tree[a].add(b);
            tree[b].add(a);
        }

        // DFS를 통해서 자식의 값을 부모의 값으로 자식의 answer에 현재 부모의 값을 넣음
        DFS(1);


        for (int i=2; i<=n; i++) {
            System.out.println(answer[i]);
        }
    }
}
