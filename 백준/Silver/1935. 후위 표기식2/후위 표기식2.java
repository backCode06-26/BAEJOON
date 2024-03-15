import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        double[] nums = new double[num];
        for(int i=0; i<num; i++) {
            nums[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> floats = new Stack<>();
        double result = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '+':
                    double b = floats.pop();
                    double a = floats.pop();
                    floats.push(a + b);
                    break;
                case '-':
                    b = floats.pop();
                    a = floats.pop();
                    floats.push(a - b);
                    break;
                case '*':
                    b = floats.pop();
                    a = floats.pop();
                    floats.push(a * b);
                    break;
                case '/':
                    b = floats.pop();
                    a = floats.pop();
                    floats.push(a / b);
                    break;
                default:
                    floats.push(nums[(int)ch - 65]);
                    break;
            }
        }
        result = floats.pop();

        // 결과값을 두 자리로 출력
        System.out.printf("%.2f", result);
    }
}
