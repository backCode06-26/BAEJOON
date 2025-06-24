import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] isbn = sc.nextLine().split("");

        int idx = 0;

        int sum = 0;
        for (int i = 1; i <= isbn.length; i++) {

            String isbnNum = isbn[i-1];
            if (isbnNum.equals("*")) {
                idx = i;
                continue;
            }
            int num = Integer.parseInt(isbnNum);
            sum += (i % 2 == 0 ? num*3 : num);
        }

        int answer = idx % 2 == 0 ? (((10 - (sum % 10)) * 7) % 10) : (10 - (sum % 10));

        System.out.println(answer);

    }
}
