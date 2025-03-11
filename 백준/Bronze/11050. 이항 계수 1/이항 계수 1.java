import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        int total = 1;
        for(int i=2; i<=n; i++){
            total *= i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k  = sc.nextInt();

        int result = factorial(n) / (factorial(n-k) *  factorial(k));
        System.out.println(result);
    }
}
