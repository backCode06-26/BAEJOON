import java.util.*;

public class Main {
    static Map<Integer, Integer> map;

    static int moneyCal(Map<Integer, Integer> map) {
        List<Integer> keys = new ArrayList<>(map.keySet());

        int answer = 0;
        if (keys.size() == 1) {
            answer = 50000 + keys.get(0) * 5000;

        } else if (keys.size() == 2) {
            if (map.get(keys.get(0)) == 3 || map.get(keys.get(1)) == 3) {
                int val = (map.get(keys.get(0)) == 3) ? keys.get(0) : keys.get(1);
                answer = 10000 + val * 1000;

            } else {
                int val1 = keys.get(0);
                int val2 = keys.get(1);
                answer = 2000 + val1 * 500 + val2 * 500;
            }

        } else if (keys.size() == 3) {
            int val = (map.get(keys.get(0)) == 2) ? keys.get(0) :
                    (map.get(keys.get(1)) == 2) ? keys.get(1) : keys.get(2);
            answer = 1000 + val * 100;

        } else if (keys.size() == 4) {

            int max = Collections.max(keys);
            answer = max * 100;
        }

        map.clear(); // 다음 게임을 위해 초기화
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new HashMap<>();

        int n = sc.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
            map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(d, map.getOrDefault(d, 0) + 1);

            max = Math.max(max, moneyCal(map));
        }
        System.out.println(max);
    }
}
