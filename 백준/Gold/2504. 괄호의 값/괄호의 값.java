import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();

        String str = sc.next();

        int value = 1;
        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                value *= 2;
                stack.push(ch);
            } else if(ch == '[') {
                value *= 3;
                stack.push(ch);
            } else if(ch == ')') {
                if(stack.isEmpty() || stack.peek() !='(') {
                    result = 0;
                    break;
                } else if(str.charAt(i-1) == '(') {
                    result += value;
                }
                stack.pop();
                value /= 2;
            } else if(ch == ']') {
                if(stack.isEmpty() || stack.peek() !='[') {
                    result = 0;
                    break;
                } else if(str.charAt(i-1) == '[') {
                    result += value;
                }
                stack.pop();
                value /= 3;
            }
        }

        if(!stack.isEmpty()) System.out.println(0);
        else System.out.println(result);

    }
}