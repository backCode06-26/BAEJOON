import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] arr = new int[t];

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);

            sum += num;

            arr[i] = num;
        }
        Arrays.sort(arr);

        int avg = Math.round((float) sum / t);

        int idx = arr.length / 2;
        int median = arr[idx];

        int maxValue = map.values().stream().max(Integer::compareTo).orElseThrow(() -> new NoSuchElementException("값이 존재하지 않습니다"));

        List<Integer> maxKeys = map.entrySet().stream()
                .filter(e -> e.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        int mode = maxKeys.get(maxKeys.size() == 1 ? 0 : 1);

        int range = arr[arr.length - 1] - arr[0];

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}

