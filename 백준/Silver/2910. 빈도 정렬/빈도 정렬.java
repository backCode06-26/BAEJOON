import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextInt();

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> order = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!count.containsKey(num)) {
                order.add(num);
            }
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        order.sort((a, b) -> {
            int freqA = count.get(a);
            int freqB = count.get(b);

            if (freqA != freqB) {
                return freqB - freqA;
            }
            return 0;
        });

        for (int num : order) {

            int size = count.get(num);
            for (int i = 0; i < size; i++) {
                System.out.print(num + " ");
            }
        }
    }
}
