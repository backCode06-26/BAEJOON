import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> chst = new Stack<>();
        int result = 0;

        for(int i=0; i<s.length(); i++) {

            char front = s.charAt(i);
            if(front == '(') {
                chst.push(front);
            } else if(front == ')') {
                if(s.charAt(i - 1) == '(') {
                    chst.pop();
                    result += chst.size();
                } else if(s.charAt(i - 1) != '(') {
                    result += 1;
                    chst.pop();
                }
            }
        }
        System.out.println(result);
    }
}