import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while(N-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = in.nextInt();
            }

            int[] b = new int[m];
            for(int i=0; i<m; i++) {
                b[i] = in.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int ans = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(b[j] < a[i]) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
