import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if(n1 + n2 + n3 == 180) {
            if(n1 == n2 && n2 == n3) {
                System.out.println("Equilateral");
            } else if(n1 == n2 || n2 == n3 || n3 == n1) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }

}