import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int happyCnt = 0;
        int sadCnt = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals(":-)")) {
                happyCnt++;
            } else if (sub.equals(":-(")) {
                sadCnt++;
            }
        }

        if (happyCnt == 0 && sadCnt == 0) {
            System.out.println("none");
        } else if (happyCnt > sadCnt) {
            System.out.println("happy");
        } else if (happyCnt < sadCnt) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
        }
    }
}
