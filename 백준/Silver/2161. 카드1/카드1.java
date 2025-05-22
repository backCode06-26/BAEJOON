import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        do {
            sb.append(q.poll()).append(" ");

            if (q.isEmpty()) break;
            q.add(q.poll());
        } while (true);

        System.out.println(sb);
    }
}
