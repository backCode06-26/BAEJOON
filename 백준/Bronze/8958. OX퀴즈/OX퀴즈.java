import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            String str = in.next();
            System.out.println(check(str));
        }
    }

    public static int check(String str) {
        int result = 0;

        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'O') {
                count++;
            } else {
                count = 0;
            }
            result += count;
        }
        return result;
    }
}
