import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();

        long cnt = 0;
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <='9') {
            	cnt += (ch - '0') * Math.pow(num, j);
            }else if(ch >='A' && ch <= 'Z') {
            	cnt += (ch - 'A' + 10) * Math.pow(num, j);
            }
            j++;
        }
        System.out.println(cnt);
        sc.close();
    }
}