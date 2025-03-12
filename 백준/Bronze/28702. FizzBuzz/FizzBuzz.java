import java.util.Scanner;

public class Main {
    public static boolean is_number(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = {
                sc.next(),sc.next(),sc.next()
        };

        int target = 0;
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if(is_number(s[i])) {
                target = Integer.parseInt(s[i]);
                index = i;
            }
        }

        int result = target;
        for(int i = index; i<s.length;i++) {
            result++;
        }

        if(result % 3 == 0 && result % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(result % 3 == 0) {
            System.out.println("Fizz");
        } else if(result % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }
    }
}
