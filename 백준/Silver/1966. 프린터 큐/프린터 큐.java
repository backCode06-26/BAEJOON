import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int cnt = 0;

            int n = sc.nextInt();
            int m = sc.nextInt();

            Queue<int[]> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < n; j++) {
                int priority  = sc.nextInt();
                q.offer(new int[] {j, priority});
                pq.offer(priority);
            }

            while (!q.isEmpty()) {
                int[] first = q.poll();

                if (first[1] == pq.peek()) {
                    pq.poll();
                    cnt++;
                    if (first[0] == m) {
                        sb.append(cnt).append("\n");
                        break;
                    }
                } else {
                    q.add(first);
                }
            }
        }
        System.out.println(sb);
    }
}