import java.util.Scanner;

public class Main {
    public static int sum_digit(int num) {

        int total = 0;
        while (num > 0) {
            total += num % 10;
            num /= 10;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        for(int i=1;i<n;i++) {
            int num = i + sum_digit(i);
            if(num == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
