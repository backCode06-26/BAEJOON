import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] nums = new int[n];

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();

            end = Math.max(nums[i], end);
        }

        while (start < end) {

            int mid = (start + end) / 2;
            long sum = 0;
            for (int num :nums) {
                sum += Math.max(num -mid, 0);
            }

            if (sum < m) {
                // 나무를 더 작은 높이로 절단함
                end = mid;
            } else {
                // 나무를 더 큰 높이로 절단함
                // 밑에서 하한선을 올려야하는데 확인이 된것이라서 1추가
                start = mid +1;
            }
        }

        // 마지막에도 1이 추가되었기 때문에 뺍니다.
        System.out.println(start -1);
    }
}
