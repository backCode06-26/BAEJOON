import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String is_balance(String text) {
        Stack<Character> check_stack = new Stack<>();

        for (int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);

            if(ch == '(' || ch == '[') {
                check_stack.push(ch);
            } else {
                if(ch == ')') {
                    if(check_stack.isEmpty() || check_stack.peek() != '(') {
                        return "no";
                    } else {
                        check_stack.pop();
                    }
                } else if(ch == ']') {
                    if(check_stack.isEmpty() || check_stack.peek() != '[') {
                        return "no";
                    } else {
                        check_stack.pop();
                    }
                }
            }
        }
        return (check_stack.isEmpty()) ? "yes" : "no";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();
            if(text.equals(".")) {
                return;
            }
            
            System.out.println(is_balance(text));
        }
    }
}
