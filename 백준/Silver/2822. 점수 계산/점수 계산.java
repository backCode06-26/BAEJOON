import java.util.*;
import java.util.stream.Collectors;

public class Main {
    final static int NUM_RANGE = 8;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> rank = new HashMap<>();

        for (int i = 1; i<= NUM_RANGE; i++) {
            int num = sc.nextInt();

            rank.put(num, i);
        }

        List<Map.Entry<Integer, Integer>> sorted = rank.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .limit(5)
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : sorted) {
            sb.append(entry.getValue()).append(" ");
            result += entry.getKey();
        }
        System.out.println(result);
        System.out.println(sb.toString());
    }
}
