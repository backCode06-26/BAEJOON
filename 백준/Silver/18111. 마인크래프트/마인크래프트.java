import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] heights = new int[257];
        Set<Integer> recodeHeights = new HashSet<>();

        for (int i = 0; i < x; i++) {
            StringTokenizer heightList = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                int height = Integer.parseInt(heightList.nextToken());

                max = Math.max(max, height);
                min = Math.min(min, height);

                heights[height]++;

                recodeHeights.add(height);
            }
        }

        int finalHeight = 0;
        int minTime = Integer.MAX_VALUE;

        mainLoop:
        for (int height = min; height <= max; height++) {

            int time = 0;
            int totalBlockConut = count;

            for (int recodeHeight : recodeHeights) {
                int result = recodeHeight - height;

                if (result > 0) {
                    time += 2 * ((recodeHeight - height) * heights[recodeHeight]);
                    totalBlockConut += ((recodeHeight - height) * heights[recodeHeight]);
                } else if (result < 0) {
                    time += ((height - recodeHeight) * heights[recodeHeight]);
                    totalBlockConut -= ((height - recodeHeight) * heights[recodeHeight]);
                }
            }

            if (totalBlockConut >= 0) {
                if (time < minTime) {
                    finalHeight = height;
                    minTime = time;
                }
                else if (time == minTime && height > finalHeight) {
                    finalHeight = height;
                }
            }
        }

        System.out.printf("%d %d\n", minTime, finalHeight);

    }
}