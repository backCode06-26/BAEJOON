import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hillHeight = sc.nextLine().split(" ");

        int beforeHeight = Integer.parseInt(hillHeight[0]);
        for (int i = 1; i < hillHeight.length; i++) {
            int currentHeight = Integer.parseInt(hillHeight[i]);

            if (beforeHeight > currentHeight) {
                System.out.println("Bad");
                return;
            }
            beforeHeight = currentHeight;
        }
        System.out.println("Good");
    }
}
