import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int up = in.nextInt();
        int down = in.nextInt();
        int length = in.nextInt();

        int day = (length - down) / (up - down);

        // 나머지가 생기는 경우가 생김
        // 그래서 하루을 더 보내는 경우가 생김
        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}