import java.util.Scanner;

public class Main{
    public static int personCount(int k, int n) {
        int[] floor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        // k층에 도달할떄 까지 반복한다.
        for(int i = 0; i < k; i++) {

            // n호의 입주민을 누적합한다.
            int total = 0;
            for(int j = 0; j < n; j++) {
                total += floor[j];
                floor[j] = total;
            }
        }
        return floor[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            sb.append(personCount(k,n)).append("\n");
        }
        System.out.println(sb);
    }
}
