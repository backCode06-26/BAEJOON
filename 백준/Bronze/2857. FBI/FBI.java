import java.util.Scanner;

public class Main {

    final static int RANGE = 5;
    final static String FBI_WORD = "FBI";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < RANGE; i++) {
            String str = sc.nextLine();

            int order = i+1;

            int idx = 0;
            int firstIdx = 0;
            int lastIdx = (idx+2);

            int len = str.length()-1;
            while (lastIdx <= len) {

                String current = str.substring(firstIdx, lastIdx+1);
                if (current.equals(FBI_WORD)) {
                    sb.append(order).append(" ");
                    break;
                }

                firstIdx += 1;
                lastIdx += 1;
            }
        }

        System.out.println((sb.length() == 0) ? "HE GOT AWAY!" : sb.toString());
        sc.close();
    }
}
