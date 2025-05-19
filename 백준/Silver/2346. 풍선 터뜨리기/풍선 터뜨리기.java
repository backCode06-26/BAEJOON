import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    static class Balloon {
        int index;
        int move;

        Balloon() {}

        Balloon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        ArrayDeque<Balloon> dq = new ArrayDeque<>();
        for (int i=1; i<=t; i++) {
            dq.add(new Balloon(i,sc.nextInt()));
        }

        Balloon balloon = new Balloon();
        if (!dq.isEmpty()) {
            balloon = dq.pollFirst();
        }

        do {
            System.out.print(balloon.index + " ");

            if (dq.isEmpty()) break;

            if (balloon.move > 0) {
                for (int j = 0; j < balloon.move - 1; j++) {
                    dq.addLast(dq.pollFirst());
                }
                balloon = dq.pollFirst();
            } else {
                for (int j = 0; j < -balloon.move - 1; j++) {
                    dq.addFirst(dq.pollLast());
                }
                balloon = dq.pollLast();
            }
        } while (true);

    }
}
