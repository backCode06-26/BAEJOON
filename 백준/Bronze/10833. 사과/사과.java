import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int answer = 0;
        for (int i=0; i<n; i++) {
            int student = sc.nextInt();
            int apple = sc.nextInt();
            answer += (apple % student);
        }
        System.out.println(answer);
    }
}
