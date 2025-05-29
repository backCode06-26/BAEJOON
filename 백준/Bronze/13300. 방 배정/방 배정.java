import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] people = new int[7][2];
        for (int i = 0; i < n; i++) {
            int gender = sc.nextInt();
            int grade = sc.nextInt();

            people[grade][gender]++;
        }

        int result = 0;
        for (int i = 1; i < people.length; i++) {
            result += Math.ceil((double) people[i][0] / m);
            result += Math.ceil((double) people[i][1] / m);
        }

        System.out.println(result);
    }
}
