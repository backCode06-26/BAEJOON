import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] lines) {
        Arrays.sort(lines, Comparator.comparing(line -> line[0]));

        int min = Arrays.stream(lines).flatMapToInt(Arrays::stream).min().getAsInt();
        int max = Arrays.stream(lines).flatMapToInt(Arrays::stream).max().getAsInt();

        int offset = 0;
        if (min < 0) {
            offset = -min;
        }

        int[] visited = new int[max+offset+1];

        int cnt = 0;

        int current = 0;
        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];

            current = end + offset;

            for (int j = start; j <= end; j++) {
                int idx = j + offset;

                int value = visited[idx];
                if (current != idx && value < 2) {
                    visited[j + offset]++;

                    if (visited[j + offset] >= 2) cnt++;
                }
            }
        }

        return cnt;
    }
}