import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            arr[i] = Math.abs(s - a);
        }

        int gcd = arr[0];
        for(int i=1; i<arr.length; i++) {
            gcd = GCD(gcd, arr[i]);
        }
        System.out.println(gcd);
    }

    public static int GCD (int a, int b) {
        if(b == 0) return a;
        return GCD(b, a % b);
    }
}
