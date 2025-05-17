import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int t = sc.nextInt();
        sc.nextLine();

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i=0; i<t; i++) {
            String str = sc.nextLine();
            if (str.startsWith("1")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                dq.addFirst(num);
            } else if (str.startsWith("2")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                dq.addLast(num);
            } else if (str.startsWith("3")) {
                int value = !dq.isEmpty() ? dq.pollFirst() : -1;
                sb.append(value).append("\n");
            } else if (str.startsWith("4")) {
                int value = !dq.isEmpty() ? dq.pollLast() : -1;
                sb.append(value).append("\n");
            } else if (str.startsWith("5")) {
                sb.append(dq.size()).append("\n");
            } else if (str.startsWith("6")) {
                sb.append((dq.isEmpty()) ? 1 : 0).append("\n");
            } else if (str.startsWith("7")) {
                int value = !dq.isEmpty() ? dq.peekFirst() : -1;
                sb.append(value).append("\n");
            } else if (str.startsWith("8")) {
                int value = !dq.isEmpty() ? dq.peekLast() : -1;
                sb.append(value).append("\n");
            }
        }
        System.out.println(sb);
    }
}
