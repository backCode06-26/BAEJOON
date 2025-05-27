import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int m = sc.nextInt();
        int d = sc.nextInt();

        int total = 0;
        for(int i = 0; i < m-1; i++) {
            total += daysInMonth[i];
        }
        total += d;
        total %= 7;

        String result = days[total];
        System.out.println(result);
    }
}
