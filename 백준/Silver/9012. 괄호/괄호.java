import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            System.out.println(solve(br.readLine()));
        }
    }

    public static String solve(String str) {
        Stack<Character> charStack = new Stack<>();
        for(int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);
            if(ch == '(') {
                charStack.push('(');
            } else if(charStack.isEmpty()) {
                return "NO";
            } else {
                charStack.pop();
            }
        }

        if(charStack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
