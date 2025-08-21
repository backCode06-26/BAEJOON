import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] arr = new int[t];

        int[] counts = new int[8001];

        int sum = 0;
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();

            sum += num;
            arr[i] = num;
            counts[num + 4000]++;
        }
        Arrays.sort(arr);

        int avg = Math.round((float) sum / t);

        int median = arr[t/2];

        List<Integer> modes = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < counts.length; i++) {
            if (max < counts[i]) {
                max = counts[i];
                modes.clear();
                modes.add(i - 4000);

            } else if (max == counts[i]) {
                modes.add(i - 4000);

            }
        }

        int mode = modes.size() == 1 ? modes.get(0) : modes.get(1);

        int range = arr[arr.length - 1] - arr[0];

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}

