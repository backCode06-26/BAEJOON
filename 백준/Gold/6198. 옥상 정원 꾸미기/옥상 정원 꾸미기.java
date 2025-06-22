import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        long answer = 0;
        for(int i = 0; i< n; i++) {

            int height = Integer.parseInt(br.readLine());

            while(!stack.isEmpty()) {

                if(stack.peek() <= height) {
                    stack.pop();
                }
                else break;
            }
            answer += stack.size();
            stack.push(height);
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
