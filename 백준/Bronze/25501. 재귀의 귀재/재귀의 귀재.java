import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int recursion(String str, int start, int end) {
        cnt++;
        if (start >= end) return 1;
        else if (str.charAt(start) != str.charAt(end)) return 0;
        return recursion(str, start+1, end-1);
    }
    static int isPalindrome(String str) {
        return recursion(str, 0, str.length()-1);
    }

    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++) {
            String str = sc.nextLine();

            bw.write(isPalindrome(str) + " ");
            bw.write(cnt + "\n");
            cnt = 0;
        }

        bw.flush();
        bw.close();
    }
}
