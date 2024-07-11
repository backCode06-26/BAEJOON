import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int j = 0; j< n; j++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int ans = 1;

            for (int i=0;i<b;i++) {
                ans = (ans*a)%10;
            }
            if(ans == 0) ans=10;
            System.out.println(ans);
        }
    }
}