import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();

        Stack<Character> operators = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                    
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!operators.empty() && precedence(operators.peek()) >= precedence(ch)) {
                        sb.append(operators.pop());
                    }
                    operators.push(ch);
                    break;
                    
                case '(':
                    operators.push(ch);
                    break;
                case ')':
                    while (!operators.empty() && operators.peek() != '(') {
                        sb.append(operators.pop());
                    }
                    operators.pop();
                    break;
                    
                default:
                    sb.append(ch);
                    break;
            }
        }

        while (!operators.empty()) {
            sb.append(operators.pop());
        }
        System.out.println(sb);
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0; // 괄호의 경우 우선 순위를 가지지 않으므로 0을 반환
        }
    }
}