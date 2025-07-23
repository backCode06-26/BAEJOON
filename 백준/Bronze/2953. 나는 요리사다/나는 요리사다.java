import java.util.Scanner;

public class Main {

    final static int RANGE = 5;
    final static int LNE = 4;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int maxOrder = 0;
        int maxValue = 0;
        for (int i=1; i<=RANGE; i++) {

            int sum = 0;
            for (int j=0; j<LNE; j++) sum += sc.nextInt();

            if (sum > maxValue) {
                maxOrder = i;
                maxValue = sum;
            }
        }
        sb.append(maxOrder).append(" ").append(maxValue);
        System.out.println(sb.toString());


    }
}
