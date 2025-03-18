import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Queue<Integer> card = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            card.add(i);
        }

        while (card.size() > 1) {
            // 첫번째 카드 버리기
            card.poll();

            // 버린 다음 첫번째 카드 뒤로 보내기
            card.add(card.poll());
        }

        System.out.println(card.poll());
    }
}
