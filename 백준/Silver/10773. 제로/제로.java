import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int n = in.nextInt();
        for(int i=0; i<n; i++) {
            int input = in.nextInt();
            if(input != 0) {
                stack.push(input);
            } else {
                stack.pop();
            }
        }

        int result = 0;
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}
