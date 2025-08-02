import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int minRoundTripDistance (int[] distances) {
        Arrays.sort(distances);
        return (distances[distances.length-1] - distances[0]) * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int storeCnt = sc.nextInt();

            int[] storeDistances = new int[storeCnt];
            for (int j=0; j<storeCnt; j++) {
                storeDistances[j] = sc.nextInt();
            }

            sb.append(minRoundTripDistance(storeDistances)).append("\n");
        }

        System.out.println(sb);
    }
}
