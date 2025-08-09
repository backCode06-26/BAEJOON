import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calculatedValue = Integer.MAX_VALUE;
        char sign = ' ';
        while (true) {
            String token = sc.next();

            if (token.equals("=")) break;

            if (calculatedValue == Integer.MAX_VALUE) {
                calculatedValue = Integer.parseInt(token);

            } else {
                if (token.matches("-?\\d+")) {
                    int valueToCalculate = Integer.parseInt(token);

                    switch (sign) {
                        case '+' : calculatedValue += valueToCalculate; break;
                        case '-' : calculatedValue -= valueToCalculate; break;
                        case '*' : calculatedValue *= valueToCalculate; break;
                        case '/' : calculatedValue /= valueToCalculate; break;
                    }
                } else {
                    sign = token.charAt(0);
                }
            }
        }
        System.out.println(calculatedValue);
    }
}
