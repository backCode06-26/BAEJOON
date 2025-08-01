import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chickenCnt = sc.nextInt();
        int coke = sc.nextInt();
        int lager = sc.nextInt();

        int maxChickenCnt = (coke / 2) + lager;

        System.out.println(Math.min(maxChickenCnt, chickenCnt));
    }
}
