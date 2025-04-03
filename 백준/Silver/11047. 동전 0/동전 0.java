import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int money = sc.nextInt();

        int[] coins = new int[t];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }

        int total = 0;
        for(int i = coins.length-1; i >= 0; i--){
            if(coins[i] <= money){
                total += money / coins[i];
                money = money % coins[i];
            }
        }
        System.out.println(total);
    }
}
