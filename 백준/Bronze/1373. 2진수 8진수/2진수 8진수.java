import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        while (str.length() % 3 != 0) {
            str = '0' + str;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 3) {
            int num = (str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i + 2) - '0') * 1;
            result.append(num);
        }
        System.out.println(result);
    }
}
