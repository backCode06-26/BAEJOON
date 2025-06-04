import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.stream(arr).sorted((a, b) -> {
            if(a.length() != b.length()) {
                return a.length() - b.length();
            } else {

                int sumA = 0;
                int sumB = 0;
                for (int i = 0; i < a.length(); i++) {
                    if(Character.isDigit(a.charAt(i))) {
                        sumA += a.charAt(i)-'0';
                    }
                }

                for (int i = 0; i < b.length(); i++) {
                    if(Character.isDigit(b.charAt(i))) {
                        sumB += b.charAt(i)-'0';
                    }
                }

                if(sumA == sumB) {
                    return a.compareTo(b);
                } else {
                    return sumA - sumB;
                }
            }
        }).forEach(System.out::println);
    }
}
