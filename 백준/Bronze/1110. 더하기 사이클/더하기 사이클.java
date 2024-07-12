import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = in.nextInt();
        int num = ans;

        int cnt = 1;
        while(true) {
            int tens = (num / 10) % 10;
            int units = num % 10;

            int add = (tens + units) % 10;
            num = units*10 + add;

            if(ans == num) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}

