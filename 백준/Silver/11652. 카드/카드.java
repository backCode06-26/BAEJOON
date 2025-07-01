import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            long num = Long.parseLong(br.readLine());

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }

        long maxValueKey = map.entrySet().stream().sorted(
                        Comparator

                                // 값으로 내림차순으로 정렬한다
                                .comparing(Map.Entry<Long, Integer>::getValue).reversed()

                                // 값이 같은 경우 키로 오름차순으로 정렬한다.
                                .thenComparing(Map.Entry::getKey)
                ).findFirst().get().getKey();

        bw.write(String.valueOf(maxValueKey)+"\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
