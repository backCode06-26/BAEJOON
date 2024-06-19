import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] arr = in.nextLine().toCharArray();

        for(char c : arr) {
            if(Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}