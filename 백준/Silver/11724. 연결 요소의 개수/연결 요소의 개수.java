import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void BFS(int check) {
        if(visited[check]){
            return;
        }
        visited[check] = true;
        for(int i : A[check]){
            if(!visited[i]){
                BFS(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt()+1;
        int m = sc.nextInt();

        A = new ArrayList[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            A[a].add(b);
            A[b].add(a);
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            if(!visited[i]){
                count++;
                BFS(i);
            }
        }
        System.out.println(count);
    }
}
