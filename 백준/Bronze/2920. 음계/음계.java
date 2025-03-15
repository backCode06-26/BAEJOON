import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(
                (str.equals("1 2 3 4 5 6 7 8")) ? "ascending" :
                        (str.equals("8 7 6 5 4 3 2 1") ? "descending" :
                                "mixed")
        );
    }
}
