import java.util.Scanner;

public class Main {
    static final int YOUNGSIK = 30;
    static final int MINSIC = 60;

    static final int YOUNGSIK_MONEY = 10;
    static final int MINSIC_MONEY = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int youngsik_total = 0;
        int minsik_total = 0;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();

            youngsik_total += num / YOUNGSIK + 1;
            minsik_total += num / MINSIC + 1;
        }

        youngsik_total *= YOUNGSIK_MONEY;
        minsik_total *= MINSIC_MONEY;

        String answer = (youngsik_total < minsik_total) ?
                "Y " + youngsik_total :

                (youngsik_total == minsik_total) ?
                        "Y M " + youngsik_total : "M " + minsik_total;
        System.out.println(answer);
    }
}
