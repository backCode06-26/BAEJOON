import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = scores.length-2; i >= 0; i--) {
            int beforeScore = scores[i+1];
            int currentScore = scores[i];

            if(currentScore >= beforeScore) {
                int diff = currentScore - (beforeScore - 1);
                sum += diff;

                scores[i] = beforeScore - 1;
            }
        }
        System.out.println(sum);
    }
}
