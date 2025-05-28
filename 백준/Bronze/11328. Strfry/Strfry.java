import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer result = new StringBuffer();

        int n = sc.nextInt();

        StringBuffer sb;
        for (int i = 0; i < n; i++) {
            char[] s1 = sc.next().toCharArray();
            Arrays.sort(s1);

            char[] s2 = sc.next().toCharArray();
            Arrays.sort(s2);

            if (s1.length != s2.length) {
                result.append("Impossible").append("\n");
                continue;
            }

            // s1의 문자로 s2가 구성되는지 비교
            boolean flag = true;
            for (int j = 0; j < s1.length; j++) {
                if (s1[j] != s2[j]) {
                    result.append("Impossible");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.append("Possible");
            }
            result.append("\n");

        }
        System.out.println(result);
    }
}
