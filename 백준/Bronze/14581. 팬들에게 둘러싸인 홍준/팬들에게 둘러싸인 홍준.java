import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println(":fan::fan::fan:");
        System.out.printf(":fan::%s::fan:\n", name);
        System.out.println(":fan::fan::fan:");
    }

}
